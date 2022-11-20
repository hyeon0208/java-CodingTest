package 기본형과참조형;
public class OverflowEx {
    public static void main(String[] args) {
		short sMin = -32768; // short가 표현가능한 최소값
		short sMax = 32767; // short가 표현가능한 최대값
		char cMin = 0; // char가 표현가능한 최소값
		char cMax = 65535; // char가 표현간으한 최대값
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1)); // 최소값 - 1 = 최대값
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1 = " + (short)(sMax+1)); // 최대값 + 1 = 최소값
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1 = " + (int)(cMin-1)); // 최소값 - 1 = 최대값
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1 = " + (cMax+1)); // 문자형이기 때문에 (int)로 형변환필요
		System.out.println("cMax+1 = " + (int)(++cMax)); // 최대값 + 1 = 최소값

	}
}
