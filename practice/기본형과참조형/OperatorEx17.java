package 기본형과참조형;
public class OperatorEx17 {
    public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
		
		System.out.println("pi는 :" + shortPi);
		
		double pi2 = 3.141592;
		// Math.rounts는 소숫점 첫째자리를 반올림한다.
		double shortPi2 = Math.round(pi2 * 1000)/ 1000.0;
		
		System.out.println("pi2는 : " + shortPi2);
	}

}
