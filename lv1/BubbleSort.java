
public class ArrayEx10 {
	// 버블정렬
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i =0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10)); // 0~9의 임의의 값 추가
		}
		System.out.println();
		System.out.println("-----버블정렬 과정-------");

		// numArr.length-1 인 이유는 왼쪽 오른쪽 값을 한번 비교하고 나면 마지막 번째는 항상 최대값이므로
		// 또한, 왼쪽과 오른쪽을 비교하기 때문에 마지막 번째는 오른쪽의 비교대상이 없기 때문이다.
		for (int i = 0; i < numArr.length-1; i++) {
			boolean changed = false; // 자리바꿈 발생 체크
			
			// for문을 반복할 수록 비교횟수가 1씩 줄어들기 떄문에 numArr.length-1에 -i을 해준다.
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
