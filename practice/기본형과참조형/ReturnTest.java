package 기본형과참조형;
class ReturnTest {
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();

		int result = r.add(3,5);
		System.out.println(result);

		int[] result2 = {0}; // 배열을 생성하고 result2[0]의 값을 0으로 초기화
		r.add(3,5,result2);  // 배열을 add메서드의 매개변수로 전달
		System.out.println(result2[0]);
	}

		// 반환 값이 있는 add 메서드
	int add(int a, int b) {
		return a + b;
	}
		// 반환 값이 없는 add 메서드
	void add(int a, int b, int[] result) {
		result[0] = a + b;  // 매개변수로 넘겨받은 배열에 연산결과를 저장
	}
}