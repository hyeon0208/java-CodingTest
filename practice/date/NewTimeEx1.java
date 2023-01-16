package date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class NewTimeEx1 {
	public static void main(String[] args) {
		checkWithMethod();
		checkPlusMinusMethod();

	}

	private static void	checkWithMethod() {
		LocalDate date = LocalDate.now(); // 오늘의 날짜
		LocalTime time = LocalTime.now();  // 현재 시간

		System.out.println(date); // 2023-01-16
		System.out.println(date.withYear(2022)); // 2022-01-16
		System.out.println(date.withMonth(12)); // 2023-12-16
		System.out.println(date.withDayOfMonth(31)); // 2023-01-31
		System.out.println(date.getDayOfYear()); // 16 (1월 1일 부터 16번째 일)

		System.out.println(time); // 22:59:37.880646500
		System.out.println(time.withHour(1)); // 01:59:37.880646500
		System.out.println(time.withMinute(30)); // 22:30:37.880646500
		System.out.println(time.withSecond(50)); // 22:59:50.880646500
		System.out.println(time.withNano(3333)); // 22:59:37.000003333
	}

	private static void checkPlusMinusMethod() {
		LocalDate date = LocalDate.now(); // 오늘의 날짜
		LocalTime time = LocalTime.now();  // 현재 시간

		System.out.println(date); // 2023-01-16
		System.out.println(date.plus(3, ChronoUnit.DAYS)); // 2023-01-19
		System.out.println(date.plusDays(10)); // 2023-01-26
		System.out.println(time); // 23:07:48.202294900
		System.out.println(time.plusHours(3)); // 02:07:48.202294900
	}
}
