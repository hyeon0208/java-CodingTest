public class ArrayCnt {
    public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] cntArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10); // 0~10 랜덤한 수 추가
			System.out.print(numArr[i]);
			}
		System.out.println();
		
		for (int i = 0; i < numArr.length; i++) {
			cntArr[numArr[i]]++;
		}
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println( i + "의 개수 : " + cntArr[i]);
		}
		
	}
}
