
public class PrintfEx2 {

	public static void main(String[] args) {

		int i = 10;
		String url = "www.hstory0208.com";
		
		System.out.printf("i=[%5d]%n", i); // 5글자의 출력공간 확보 (양수는 오른쪽 정렬 )
		System.out.printf("i=[%10d]%n", i); // 10글자의 출력공간 확보  (양수는 오른쪽 정렬 )
		System.out.printf("i=[%50d]%n", i); // 50글자의 출력공간 확보 (양수는 오른쪽 정렬 )
		
		System.out.printf("i=[%-5d]%n", i); // 5글자의 출력공간 확보 (음수는 왼쪽 정렬 )
		
		System.out.printf("i=[%05d]%n", i); // 5글자를 확보하고 공백에 0을 채움
		
		System.out.printf("[12345678901234567890]%n");
		
		System.out.printf("[%s]%n", url); // 문자열의 길이만큼 출력공간 확보
		System.out.printf("[%20s]%n", url); // 문자열의 길이 : 20만큼 출력공간 확보 ( 양수는 오른쪽 정렬 )
		System.out.printf("[%30s]%n", url); // 문자열의 길이 : 30만큼 출력공간 확보 ( 양수는 오른쪽 정렬 )
		
		System.out.printf("[%-20s]%n", url); // 문자열의 길이 : 20만큼 출력공간 확보 ( 음수는 왼쪽 정렬 )
		System.out.printf("[%-30s]%n", url); // 문자열의 길이 : 30만큼 출력공간 확보 ( 음수는 왼족 정렬 )
		
		System.out.printf("[%.8s]%n", url);  // 왼족에서 8글자만 출력
		
	}

}



