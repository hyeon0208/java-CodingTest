class Data1 {
	int value;
}

class Data2 {
	int value;

	Data2(int x) { 	// 매개변수가 있는 생성자.
		value = x;
	}
}

class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(1);		// compile error발생
		/* Data2의 경우는 매개변수가 있는 생성자로 매개변수를 지정하여 생성해야한다.
		 * => Data2 d2 = new Data2(10);
		 */
		
		System.out.println("d1 : " + (d1));
		System.out.println("d2 : " + d2);

	}
}