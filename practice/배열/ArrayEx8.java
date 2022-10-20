public class ArrayEx8 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		// 배열의 각 요소에 1~45의 값 저장
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		int temp = 0;
		int j = 0;
		
		// 0번째 부터 5번쨰 요소까지만 바꾼다.
		for (int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45); // 0 ~ 44 의 랜덤한 값
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		for(int i = 0; i < 6; i++) System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}

}