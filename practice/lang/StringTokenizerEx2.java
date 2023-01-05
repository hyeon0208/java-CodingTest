package lang;

import java.util.*;

class StringTokenizerEx2 { 
	public static void main(String[] args) { 
		String expression = "x=100*(200+300)/2";

        // 마지막 파라미터가 true면 구분자도 토큰으로 간주한다.
		StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
} 