package milestones;

import java.time.LocalDate;

public class Conferenza extends Evento {

	private String argomento;
	private Oratore oratore;
	
	public Conferenza(String titolo, LocalDate dataEvento, int postiTotali, String argomento,Oratore oratore) throws Exception {
		super(titolo, dataEvento, postiTotali);
		this.argomento = argomento;
		this.oratore = new Oratore (oratore.getNome(),oratore.getCognome());
	}
	
	

	@Override
	public String toString() {
		String infoConferenza = getData()+ " - " + getTitolo() + " Presenta " + argomento + "L'oratore: "+ oratore.getNome() +" "+ oratore.getCognome();
		return infoConferenza;
	}

}
