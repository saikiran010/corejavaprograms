package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;
public class HandlingDates {
	
	public static void main(String args[]) {
		LocalDate currentDate=LocalDate.now();
		System.out.println("current date : "+currentDate);
		
		LocalTime currentTime=LocalTime.now();
		System.out.println("current time : "+currentTime);
		
		LocalDateTime currentDateTime=LocalDateTime.now();
		System.out.println("current date and time : "+currentDateTime);
		
		//setting  date in string format
		LocalDate date=LocalDate.parse("2023-05-17");
		System.out.println("Setting date using parse() :"+date);
		
		LocalDate date1=LocalDate.of(2001,05,13);
		System.out.println("Setting date using of() :"+date1);
		
		//retreiving  yesterday's and tomorrow's date
		LocalDate yesterdayDate=currentDate.minusDays(1);
		LocalDate tmrwDate=currentDate.plusDays(1);
		System.out.println("Yesterday date :"+yesterdayDate);
		System.out.println("Tmrw date :"+tmrwDate);
		
		//checking leapyear
		System.out.println("is leap year ? "+currentDate.isLeapYear());
		
		//setting new date-time pattern/format
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");//setting pattern
		String formattedDate=currentDateTime.format(formatter);//applying pattern
		System.out.println("Formatted date :"+formattedDate);
		
		
		//Handling zones
		ZonedDateTime currentZonedDateTime=ZonedDateTime.now();
		System.out.println("\ncurrent date and time :"+currentZonedDateTime);
		
		System.out.println("curremt zone :"+currentZonedDateTime.getZone());
		
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		
		ZonedDateTime tokyoZone=currentZonedDateTime.withZoneSameInstant(tokyo);
		System.out.println("Tokyo Zone : "+tokyoZone);
	}
}
		
		