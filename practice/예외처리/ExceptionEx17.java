class ExceptionEx17 {
	public static void main(String[] args) 
	{
		try  {
			method1();		
		} catch (Exception e)	{
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	}	

	// 예외 되던지기는 예외가 발생한 메서드와 이를 호출한 메서드 양쪽에서 예외처리를 해줘야한다.
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e;			// 다시 예외를 발생시켰다.
		}
	}	
}