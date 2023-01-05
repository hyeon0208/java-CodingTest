package lang;

import java.util.StringJoiner;

class StringEx5 {
	public static void main(String[] args) throws Exception {
		String str = "가";

		byte[] bArr  = str.getBytes("UTF-8"); // 문자열을 UTF-8로 변환
		byte[] bArr2 = str.getBytes("CP949"); // 문자열을 CP949로 변환

		System.out.println(bArr);
		System.out.println(bArr2);
		System.out.println("UTF-8:" + joinByteArr(bArr));
		System.out.println("CP949:" + joinByteArr(bArr2));

		System.out.println("UTF-8:" + new String(bArr,  "UTF-8"));
		System.out.println("CP949:" + new String(bArr2, "CP949"));
	}

	static String joinByteArr(byte[] bArr) {
		 StringJoiner sj = new StringJoiner(":", "[", "]");

		for(byte b : bArr)
			//String.format은 pritf와 사용방법이 같다.
			// String.format는 형식화된 문자열을 만들어 낸다.
			sj.add(String.format("%02X",b));

		return sj.toString();
	}
}