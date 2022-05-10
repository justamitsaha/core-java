package l.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;

public class A_dateTime {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		
		LocalDate date1 = LocalDate.of(2020, Month.OCTOBER, 20);
		LocalDate date2 = LocalDate.of(2020, 10, 20);
		System.out.println(date1);
		System.out.println(date2);
	}
}
