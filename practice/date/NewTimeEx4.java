package date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class NewTimeEx4 {
    public static void main(String[] args) {
        // 날짜의 차이
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 12, 31);

        Period pe = Period.between(date1, date2);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("pe = " + pe);

        System.out.println("YEAR = " + pe.get(ChronoUnit.YEARS));
        System.out.println("MONTH = " + pe.get(ChronoUnit.MONTHS));
        System.out.println("DAY = " + pe.get(ChronoUnit.DAYS));

        // 시간의 차이
        LocalTime time1 = LocalTime.of(10, 10, 20);
        LocalTime time2 = LocalTime.of(12, 30, 50); // 12½Ã°£ 23ºÐ 56ÃÊ

        Duration du = Duration.between(time1, time2);

        System.out.println("time1 = " + time1);
        System.out.println("time2 = " + time2);
        System.out.println("du = " + du);

        LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
        System.out.println(tmpTime);

        System.out.println("HOUR = " + tmpTime.getHour());
        System.out.println("MINUTE = " + tmpTime.getMinute());
        System.out.println("SECOND = " + tmpTime.getSecond());
        System.out.println("NANO = " + tmpTime.getNano());

        LocalDate day = LocalDate.of(2022, 12, 31);
        String d = day.format(DateTimeFormatter.ISO_LOCAL_DATE); // 2022-12-31
        String d2 = DateTimeFormatter.ISO_LOCAL_DATE.format(day); // 2022-12-31
        System.out.println(d);
        System.out.println(d2);
    }
}