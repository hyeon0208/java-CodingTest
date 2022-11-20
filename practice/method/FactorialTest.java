package method;
class FactorialTest {
	public static void main(String args[]) {
		 // main메서드와 같은 클래스에 있기 때문에 static 메서드를 호출할 때 클래스 이름을 생략 가능하다.
		// FactorialTest.factorial(4)대신 factorial(4)
		System.out.println(factorial(5));
	}

	static long factorial(int n) {  // static 메서드이므로 인스턴스를 생성하지 않고 직접 호출할수 있게 해준다.
		long result=0;

		if (n == 1) return 1;		
		else return n * factorial(n-1); //factorial 메서드 재귀호출
	}
}