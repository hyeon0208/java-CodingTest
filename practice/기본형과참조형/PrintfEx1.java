package 기본형과참조형;

public class PrintfEx1 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		int i = 13;
		String str = "안녕하세요";
		long big = 100_000_000L; // 100000000 ( _ : 천의자리 구분 )
		long hex = 0xFFFF_FFFF_FFFFL; // FFFFFFFFFFFF
		int octNum = 010; // 8진수 : 10 ( 접두사 : 0 ), 10진수 : 8
		int hexNum = 0x10; // 16진수 : 10 ( 접두사 : 0x ), 10진수 : 16
		int binNum = 0b10; // 2진수 : 10 ( 접두사 : 0b ), 10진수 2
		
		float f1 = .10f; // ( f : float 접미사 ) 0.10 , 1.0e-1
		float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c%n", c);
		System.out.printf("c=%c, %d%n", c, (int)c);
		System.out.printf("i=%d%n", i);
		
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%x%n", hex);
		System.out.printf("hex=%#x%n", hex); // #을 붙이면 접두사도 포함시킴
		
		System.out.printf("octNum=%o, %d%n", octNum, octNum); // 8진수, 10진수
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); // 16진수, 10진수
		System.out.printf("binNum=%b, %d%n", binNum, binNum); // boolean, 10진수	
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); // boolean, 10진수	
		
		System.out.printf("f1=%f1, %e, %g%n", f1, f1, f1); // %e는 지수형태, %g는 값을 간략하게 표현
		System.out.printf("f2=%f2, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f3, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
		System.out.printf("d=%014.10f%n", d); // 전체 14자리 중 소수점 10자리
}
}