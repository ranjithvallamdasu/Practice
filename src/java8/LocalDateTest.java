package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate oneHourLater = today.plus(1, ChronoUnit.DAYS);
        System.out.println(today);
        System.out.println(oneHourLater);
        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);
        LocalDate afterFourMonths = today.plusMonths(4);
        System.out.println(afterFourMonths);
        LocalDate febLastDay = LocalDate.of(2021,02,3);
        System.out.println(today.lengthOfMonth());
        System.out.println(febLastDay.lengthOfMonth()+""+febLastDay);
        LocalDate date = LocalDate.parse("11/14/2022", DateTimeFormatter.ofPattern("M/d/y"));
        System.out.println(date);
        ZoneId zoneId = ZoneId.of("Asia/Calcutta");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(),zoneId);
        System.out.println("zone: "+zonedDateTime);
        System.out.println("local: "+LocalDateTime.now());
//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

    }
}
