package test_local_date;

import static java.time.LocalDate.now;
import static java.time.LocalDate.of;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// print local date for current date
			System.out.println("curnt date " + now());// yr-mon-day
			// accepting yr mon day from user & create required date
			System.out.println("Enter yr mon & day integers ");
			System.out.println("Accepted date " + of(sc.nextInt(), sc.nextInt(), sc.nextInt()));
			System.out.println("Enter FD creation date string :  yr-mon-day & period in yrs");
			LocalDate creationDt = parse(sc.next());
			LocalDate maturityDt = creationDt.plus(sc.nextInt(), ChronoUnit.YEARS);
			System.out.println("created on  " + creationDt);
			System.out.println("Maturing on "+maturityDt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
