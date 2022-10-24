import java.util.*;

class CloneEx2 {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};

        // 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
		// clone() 을 통해 System.arraycopy보다 배열을 간단하게 복사할 수 있다.
		int[] arrClone = arr.clone(); 
		arrClone[0]= 6;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}