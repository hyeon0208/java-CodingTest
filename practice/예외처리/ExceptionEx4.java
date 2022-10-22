class ExceptionEx4 {
	public static void main(String args[]) {
			System.out.println(1);			
			System.out.println(2);
			
			// 오류를 찾는다.
			try {
				System.out.println(3);
				System.out.println(4);
			} catch (Exception e)	{
				System.out.println(5); // 오류가 발견되지 않아 실행되지 않는다.
			} 
			System.out.println(6);
	}	
}