package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {
		System.out.println("Create some dates and times...");
		LocalDate now1 = LocalDate.now();
		LocalTime now2 = LocalTime.now();
		LocalDateTime now3 = LocalDateTime.now();
		
		System.out.println(now1);
		System.out.println(now2);
		System.out.println(now3);
		
		
		
		System.out.println("Generate some Holiday dates...");
		LocalDate julyFourth = LocalDate.of(2020, 07, 04);
		LocalDate christmas = LocalDate.of(2020, 12, 25);
		
		LocalDate memorialDay = LocalDate.parse("2020-05-25");
		
		System.out.println(julyFourth);
		System.out.println(christmas);
		System.out.println(memorialDay);
		
		System.out.println("Year: "+now1.getYear());
		System.out.println("Month: "+now1.getMonth());
		System.out.println("MonthValue: "+now1.getMonthValue());
		System.out.println("Day of Year: "+now1.getDayOfYear());
		System.out.println("Day of Week: "+now1.getDayOfWeek());
		
		System.out.println("Compare som dates...");
		System.out.println("Now isBefore memorial day???"+now1.isBefore(memorialDay)); //must compare dates of same type
		System.out.println("Now isAfter christmas???"+now1.isAfter(christmas));
		System.out.println("Now compareTo christmas???"+now1.compareTo(memorialDay));
		
		
		//adjusting some dates
		System.out.println("Memorial Day of next year..."+memorialDay.withYear(2021));
		
		System.out.println("Adding and subtracting time");
		LocalDate nowPlus3Weeks = now1.plus(3, ChronoUnit.WEEKS);
		
		System.out.println("3 Weeks from now..."+nowPlus3Weeks);
		
		System.out.println("How many days until Christmas?");
		System.out.println();
		System.out.println(now1.until(christmas, ChronoUnit.DAYS));				//until
		System.out.println("Days between July4th and Memorial Day"+ChronoUnit.DAYS.between(memorialDay, memorialDay));  //between
		
		//formatting date and time
		System.out.println("Formatting dates...");
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("Current date in full format: "+formatter.format(now1));
		
		
		
		
		
		
		
		
		
		
	}

}
