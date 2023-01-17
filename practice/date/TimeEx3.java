package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeEx3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime dt = LocalDateTime.of(date, time);
        LocalDateTime dt2 = date.atTime(time);
        LocalDateTime dt3 = time.atDate(date);
        LocalDateTime dt4 = date.atTime(12, 30, 30);
        LocalDateTime dt5 = time.atDate(LocalDate.of(2000, 12, 31));

        System.out.println(dt);
        System.out.println(dt2);
        System.out.println(dt3);
        System.out.println(dt4);
        System.out.println(dt5);

        LocalDateTime dateTime = LocalDateTime.of(2000, 12, 31, 1, 30, 30);
        ZoneId zid = ZoneId.of("Asia/Seoul");
        ZonedDateTime zdt = dateTime.atZone(zid);

        ZonedDateTime seoulTime = ZonedDateTime.now();

        ZoneId nyId = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);

        System.out.println(zid);
        System.out.println(zdt);
        System.out.println(seoulTime);
        System.out.println(nyId);
        System.out.println(nyTime);

    }
}
