public class FlowEx29 {
    public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.printf("i = %d", i);
			
			// 변수 i는 for문의 제어에 사용되기 때문에 tmp 변수를 따로 선언.
			int tmp = i;
		
			do {
				// tmp%10%3==0 끝자리가 3의 배수인지 확인
				// tmp%10 != 0 끝자리가 0인 경우는 제외해야함.
				if (tmp%10%3==0 && tmp%10 != 0)
					System.out.print("짞 !");
				// while 문은 tmp를 끝까지 나누어 0이 되기전까지 반복된다.
			} while((tmp/=10) != 0);
			
			System.out.println();
		
		
		}
	}
}
