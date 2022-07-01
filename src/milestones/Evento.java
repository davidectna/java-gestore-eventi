package milestones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {

	//attributes
	private String titolo;
	private LocalDate data;
	private int postiTotali,postiPrenotati;
	LocalDate today = LocalDate.now();
	DateTimeFormatter dataFormattata = DateTimeFormatter.ofPattern("E,MMM,yyyy");
	
	//constructor 
	public Evento(String titolo, LocalDate dataEvento, int postiTotali) throws Exception{
		super();
		//date validations
		try {
			validaData(dataEvento);
		}catch (IllegalArgumentException ilArEx) {
			ilArEx.getMessage();
		}
		
		//validation of available places
		try {
			validaPostiTotali(postiTotali);
		}catch (IllegalArgumentException ilArEx) {
			ilArEx.getMessage();
		}
		
		//attribute assignment
		this.titolo = titolo;
		this.data = dataEvento;
		this.postiTotali = postiTotali;
		this.postiPrenotati = 0;
		
		
	}

	// getter and setter methods
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getData() {
		return dataFormattata.format(data);
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	public int getPostiDisponibili() {
		return postiTotali - postiPrenotati;
	}
	
	// public methods
	public void prenota(int numeroPostiRichiesti) {
		
		validaData (data);
		
		if (postiPrenotati == postiTotali) {
			throw new IllegalArgumentException("Non ci sono più posti disponibili");
		}
		else if (numeroPostiRichiesti + postiPrenotati > postiTotali) {
			throw new IllegalArgumentException("Non possiamo soddisfare la tua richiesta, sono rimasti solo"+ (getPostiDisponibili())+"posti");
		}
		else {
			postiPrenotati = postiPrenotati + numeroPostiRichiesti;
		}
		
	}
	public void disdici (int numeroPostiDisdetti) {
		
		validaData (data);
		
		if (postiPrenotati == 0) {
			throw new IllegalArgumentException("Nessun posto è stato ancora prenotato,impossibile disdirne");
		}
		else if (numeroPostiDisdetti > postiPrenotati) {
			throw new IllegalArgumentException("Stai chiedendo di disdire più posti di quelli già prenotati, fin ora sono stati prenotati solo "+(postiPrenotati)+" posti");
		}
		else {
			postiPrenotati = postiPrenotati - numeroPostiDisdetti;
		}
		
	}
	
	
	// validations methods
	private void validaData (LocalDate inputData) throws IllegalArgumentException {
		if (today.isAfter(inputData)) {
			throw new IllegalArgumentException("La data selezionata è già passata.");
		}
	}
	private void validaPostiTotali (int inputPostiTotali) {
		if (inputPostiTotali<0) {
			throw new IllegalArgumentException("I posti totali non possono essere minori di 0");
		}
	}

	@Override
	public String toString() {
		String infoEvento = getData()+ " - " + getTitolo(); 
		return infoEvento;
	}
	
	
}
