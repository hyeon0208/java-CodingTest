import java.util.*;

class StringTokenizerEx5 {
	public static void main(String[] args) {
		String data = "100,,,200,300";

		String[] result = data.split(",");
		System.out.println(Arrays.toString(data.split(",")));
		StringTokenizer st = new StringTokenizer(data, ",");

		for(int i=0; i < result.length;i++)
			System.out.print(result[i]+"|");

		// split은 빈 문장열도 토큰으로 인식한다.
		System.out.println("개수:"+result.length);

		int i=0;
		for(;st.hasMoreTokens();i++)
			System.out.print(st.nextToken()+"|");
		
		// StringTokenizer는 빈 문자열은 토큰으로 인식하지 않는다.
		System.out.println("개수:"+i);
	} 
}