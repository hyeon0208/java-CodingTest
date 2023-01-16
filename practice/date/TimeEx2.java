package date;

import java.time.LocalDate;

public class TimeEx2 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2000, 12, 31);
        LocalDate date2 = LocalDate.now(); // 2023-01-16
        System.out.println(date1.compareTo(date2)); // -23

        System.out.println(date1.isAfter(date2)); // false
        System.out.println(date1.isBefore(date2)); // true
        System.out.println(date1.isEqual(date2)); // false
    }
}
