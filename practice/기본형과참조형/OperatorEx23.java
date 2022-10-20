public class OperatorEx23 {
    	// 문자열은 비교 할 대는 == 연산자 말고 equals() 메서드를 사용해야한다.
	// equals() 는 서로 객체가 달라도 내용이 같으면 true를 반환한다.

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1 ==\"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2 ==\"abc\" ? %b%n", str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		
		// equalsIgnoreCase() 는 대소문자를 구별하지 않고 비교한다.
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));


	}
}
