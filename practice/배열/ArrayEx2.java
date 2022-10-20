import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		int [] Arr1 = new int[10]; // 길이가 10인 배열 생성 (배열의 값은 0)
		int [] Arr2 = new int[10]; 
		int [] Arr3 = {100, 95, 80, 70, 60}; // 길이가 5인 배열 생성
		int [] Arr4 = {}; // 길이가 0인 배열 생성
		char[] chArr = {'a', 'b', 'c', 'd', 'e'};
		
		for (int i = 0; i < Arr1.length; i++) {
			Arr1[i] = i + 1; // 1~10 숫자를 순서대로 Arr1 배열에 추가.
		}
		
		for (int i = 0; i < Arr2.length; i++) {
			Arr2[i] = (int)(Math.random()*10)+1; // 1~10 랜덤한 숫자를 Arr2 배열에 추가.	
		}
		
		for (int i = 0; i < Arr1.length; i++) {
			System.out.print(Arr1[i] + ",");
		}
		
		System.out.println();
		
		// 정수의 배열의값들은 타입@주소 형식으로 출력되기 때문에 Arrays.toString 으로 문자열 변환을 해줘야한다.
		System.out.println(Arrays.toString(Arr2));
		System.out.println(Arrays.toString(Arr3));
		System.out.println(Arrays.toString(chArr));
		
		// 문자열 변환이 없을시 타입@주소 형식으로 출력된다.
		System.out.println(Arr2);
		System.out.println(Arr3);
		
		// char배열만 println(); 으로 출력해도 한줄로 출력됨.
		System.out.println(chArr);
		
	}

}
