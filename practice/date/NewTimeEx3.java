package date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

class DayAfterTomorrow implements TemporalAdjuster {
    @Override
    // 날짜와 시간에 관련된 대부분의 클래스는 Temporal 인터페이스를 구현하였으므로 이 메서드의 매개변수가 될 수 있다
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2, ChronoUnit.DAYS); // 2일을 더한다.
    }
}

class NewTimeEx3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date  = today.with(new DayAfterTomorrow());

        System.out.println(today);
        System.out.println(date);

        today.with(firstDayOfNextMonth());        // 다음 달의 첫 날
        today.with(firstDayOfMonth());            // 이 달의 첫 날
        today.with(lastDayOfMonth());             // 이 달의 마지막 날
        today.with(firstInMonth(TUESDAY));        // 이 달의 첫번째 화요일
        today.with(lastInMonth(TUESDAY));         // 이 달의 마지막 화요일
        today.with(previous(TUESDAY));            // 지난 주 화요일
        today.with(previousOrSame(TUESDAY));      // 지난 주 화요일(오늘 포함)
        today.with(next(TUESDAY));                // 다음 주 화요일
        today.with(nextOrSame(TUESDAY));          // 다음 주 화요일(오늘 포함)
        today.with(dayOfWeekInMonth(4, TUESDAY)); // 이 달의 4번째 화요일
    }
}