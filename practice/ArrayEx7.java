public class ArrayEx7 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i =0; i < numArr.length; i++) {
			numArr[i] = i; // 배열에 0~9까지 정수를 담는다.
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i =0; i < 100; i++) {
			int n = (int)(Math.random() * 10); // 0~9까지 랜덤한 수 생성
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
	}
	}
}
