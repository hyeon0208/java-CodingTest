class ExceptionEx5 {
	public static void main(String args[]) {
			System.out.println(1);			
			System.out.println(2);
			try {
				System.out.println(3);
				System.out.println(0/0); // 고의적으로 ArithmeticException 오류를 발생시킨다.
				System.out.println(4); 	// 위에서 예외가 발생했기 때문에 실행되지 않는다.
			} catch (ArithmeticException ae)	{
				System.out.println(5); // 예외가 발생한 문장은 이 catch 구문을 실행시킨다.
			}	
			System.out.println(6);
	}
}