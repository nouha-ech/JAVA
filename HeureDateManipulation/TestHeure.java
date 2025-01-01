package time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestHeure {

	public static void main(String[] args) {
		// java time
		LocalDate date = LocalDate.now();
		LocalTime heure = LocalTime.now();
		System.out.println(date);
		System.out.println(heure);
		// java time
		LocalDateTime dateheure = LocalDateTime.now();
		System.out.println(dateheure);
		
		// utc 
		
		Instant instance = Instant.now();
		System.out.println(instance);
		
		
		// format personalise de date
		
		
		
		// java pattern list !!!
		// time format
		// declare formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String nvdateheure = dateheure.format(formatter);
		System.out.println(nvdateheure);

		
		// comparaison des dates heures
		
		
		LocalDateTime mybd = LocalDateTime.of(2001, 07, 15, 12, 0, 0); 
		LocalDateTime lb = LocalDateTime.of(2020, 1, 20, 0, 0, 0);

		if(mybd.isBefore(lb)){
		System.out.println(mybd + " was before " + lb);
		}
		
		else if(mybd.isEqual(lb)){
		System.out.println( "were born on same day :o");
		}
		}
		
	// isbefore(), isafter(), isafter() ..
		
		

	}


