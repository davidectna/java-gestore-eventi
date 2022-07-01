package milestones;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class ProgrammaEventi {

	public static void main(String[] args) throws Exception {
		
		List <Evento> eventsList = new ArrayList <Evento>();
//		LocalDate dataLazzaDalVivo =  ;
		eventsList.add(new Evento("Lazza in concerto", LocalDate.parse("2022-08-01"), 2000));
		eventsList.add(new Evento("Beyonce in concerto", LocalDate.parse("2022-08-15"), 2000));
		eventsList.add(new Evento("Rocio Jurado  in concerto", LocalDate.parse("2022-08-24"), 2000));
		eventsList.add(new Evento("Capo Plaza in concerto", LocalDate.parse("2022-08-31"), 2000));
		eventsList.add(new Evento("Morad in concerto", LocalDate.parse("2022-08-05"), 2000));
		eventsList.add(new Evento("Tiziano Ferro in concerto", LocalDate.parse("2022-08-08"), 2000));
		eventsList.add(new Evento("Rocco Hunt in concerto", LocalDate.parse("2022-16-"), 2000));
		eventsList.add(new Evento("Eminem in concerto", LocalDate.parse("2022-16-"), 2000));
		eventsList.add(new Evento("Travis Scott in concerto", LocalDate.parse("2022-16-"), 2000));
		eventsList.add(new Evento("Maria Becerra in concerto", LocalDate.parse("2022-16-"), 2000));
		eventsList.add(new Evento("Eros Ramazzotti in concerto", LocalDate.parse("2022-16-"), 2000));
		eventsList.add(new Evento("Dua Lipa in concerto", LocalDate.parse("2022-16-"), 2000));
		eventsList.add(new Evento("BTS Hunt in concerto", LocalDate.parse("2022-16-"), 2000));
	
	}
}
