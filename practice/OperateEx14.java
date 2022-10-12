public class OperateEx14 {
    public static void main(String[] args) {
		char c = 'a';
		for(int i=0; i<26; i++) { // 소문자 a 부터 z 까지
			System.out.print(c++);
		}
		System.out.println();
		
		c = 'A';
		for(int i=0; i<26; i++) { // 대문자 A 부터 Z까지
			System.out.print(c++);
		}
		System.out.println();

		c='0';
		for(int i = 0; i < 10; i++) { // 0부터 9까지
			System.out.print(c++);
		}
	}
}
