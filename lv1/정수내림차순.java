import java.util.*;

class 정수내림차순 {
	public long solution(long n) {
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr); // 오름차순으로 sort

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]); //내림차순으로 더하기
		}
        
		return Long.parseLong(sb.reverse().toString());

	}
}