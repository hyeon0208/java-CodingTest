public class BubbleSort {
    public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i =0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for (int i = 0; i < numArr.length-1; i++) {
			boolean changed = false; // 자리바꿈 발생 체크
			
			for (int j = 0; j < numArr.length-1-i;j++) {
				if(numArr[j] > numArr[j+1]) { //옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true; // 자리바꿈 발생했으니 true로 변환.
				}	
			}
			
			if (!changed) break; // 자리바꿈이 없으면 반복문 종료
			
			for(int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]); // 정렬 결과 출력
			}
			System.out.println();

			
		}
		
		
	}

}
