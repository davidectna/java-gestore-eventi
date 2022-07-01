package milestones;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random ();
		try  {
		System.out.println("Salve, ci dia le informazioni riguardanti l'evento specifico per effettuare eventuali cambiamenti");
		System.out.println("Inserisca il nome dell'Evento:");
		String titoloEvento = keyboard.nextLine();
		System.out.println("Inserisca l'anno dell'evento:");
		int annoEvento = keyboard.nextInt();
		System.out.println("Inserisca il mese dell'evento:");
		int meseEvento = keyboard.nextInt();
		System.out.println("Inserisca il giorno dell'evento:");
		int giornoEvento = keyboard.nextInt();
		LocalDate dataEvento = LocalDate.of(annoEvento, meseEvento, giornoEvento);
		int postiTotaliEvento = random.nextInt(500)+1;
		
		Evento primaGestione = new Evento(titoloEvento,dataEvento,postiTotaliEvento);
		
		System.out.println("Evento: " + primaGestione);
		
		boolean sceltaValida;
		
		do {
		System.out.println("Nel caso in cui voglia prenotare dei posti, digiti 1" + "\n" + "Nel caso in cui voglia disdire dei posti, digiti 2");
		int sceltaUtente = keyboard.nextInt();
		switch(sceltaUtente) {
		case 1 :
			//reservation request
			System.out.println("Quanti posti desidera prenotare?");
			int postiRichiesti = keyboard.nextInt();
			primaGestione.prenota(postiRichiesti);
			
			//places feedback n.1
			System.out.println("Numero posti prenotati:" + primaGestione.getPostiPrenotati()+ "/ Numero posti disponibili " + primaGestione.getPostiDisponibili());
			
			System.out.println("Digiti 1 nel caso in cui voglia effettuare altre modifiche"+"\n"+"Altrimenti digiti 2");
			int secondaSceltaUtenteA = keyboard.nextInt();
			  if (secondaSceltaUtenteA == 1) {
				  sceltaValida = true;
				  break;
			  }else if (secondaSceltaUtenteA == 2){
				  System.out.println("Grazie e Arrivederci");
				  System.exit(0);
			  }else {
				  System.out.println("Il numero digitato non è valido, riavii la pagina per effettuare ulteriori modifiche");
				  System.exit(0);
			  }
			
		case 2 :
			//cancellation request
			System.out.println("Quanti posti desidera disdire?");
			int postiDisdetti = keyboard.nextInt();
			primaGestione.disdici(postiDisdetti);
			
			//places feedback n.2
			System.out.println("Numero posti prenotati:" + primaGestione.getPostiPrenotati()+ "/ Numero posti disponibili" + primaGestione.getPostiDisponibili());
			
			System.out.println("Digiti 1 nel caso in cui voglia effettuare altre modifiche"+"\n"+"Altrimenti digiti 2");
			int secondaSceltaUtenteB = keyboard.nextInt();
			  if (secondaSceltaUtenteB == 1) {
				  sceltaValida = true;
				  break;
				  
			  }else if (secondaSceltaUtenteB == 2){
				  System.out.println("Grazie e Arrivederci");
				  System.exit(0);
			  }else {
				  System.out.println("Il numero digitato non è valido, riavii la pagina per effettuare ulteriori modifiche");
				  System.exit(0);
			  }	
		default : System.out.println("Il valore digitato non è valido,ritenti perfavore:");
		sceltaValida = true;
		}
		} while  (sceltaValida = true);
		
		
		}catch (IllegalArgumentException Eccezzione) {
			System.out.println("Piccolo Problema: " + Eccezzione.getMessage());
		}catch (Exception Eccezzione) {
			System.out.println("Piccolo Porblema: " + Eccezzione.getMessage());
		}
		
		keyboard.close();
	}
}
