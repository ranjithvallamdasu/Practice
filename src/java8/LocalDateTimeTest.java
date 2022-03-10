package java8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime oneHourLater = now.plusHours(2);
        System.out.println(now);
        System.out.println(oneHourLater);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime after30 = time.plus(Duration.ofMinutes(30));
        System.out.println(after30);
    }
}
