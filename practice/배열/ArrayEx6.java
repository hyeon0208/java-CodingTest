
public class ArrayEx6 {

	public static void main(String[] args) {
		int[] score = {79, 88, 81, 33, 100, 55, 91};
		int max = score[0]; // 배열의 첫번째 요소 79를 저장
		int min = score[0]; // 배열의 첫번째 요소 79를 저장
		
		for ( int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} 
			
			if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);


}
}
