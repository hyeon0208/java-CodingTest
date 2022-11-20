package method;
class VarArgsEx {
	public static void main(String[] args) {
		String[] strArr = { "100", "200", "300" };
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");
	}

	// 매개변수로 입력된 문자열에 구분자를 넣는 메서드
	static String concatenate(String delim, String... args) {
		String result = "";

		for(String str : args) {
			result += str + delim;
		}
		
		return result;
	}

/* 주석을 풀면 위의 concatenate 클래스 메서드와 구분되지 않아 에러가 발생한다.
 * 가변인자 메서드는 오버로딩하지 않는 것이 좋다.
	static String concatenate(String... args) {
		return concatenate("",args);
	}
*/
} 