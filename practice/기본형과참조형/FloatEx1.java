public class FloatEx1 {
    public static void main(String[] args) {
		float f1 = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890;
		
		System.out.printf("	123456789012345678901234%n");
		System.out.printf("f1 : %f%n", f1); // 소수점 이하 6자리 까지 출력
		System.out.printf("f1 : %24.20f%n", f1); // 정밀도가 7로 7자리까지 오차가 없지만, 그 이후로는 오차가 발생한다.
		System.out.printf("f2 : %24.20f%n", f2); // 정밀도가 7로 7자리까지 오차가 없지만, 그 이후로는 오차가 발생한다.
		System.out.printf("d : %24.20f%n", d); // 정밀도가 15로 15자리까지 오차가 없지만, 그 이후로는 오차가 발생한다.

		
	}
}
