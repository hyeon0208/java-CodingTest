

class MorseDecoder {
	public static void main(String[] args) {
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.","-..", "."
						,"..-.", "--.", "....","..",".---"
						, "-.-", ".-..", "--", "-.", "---"
						, ".--.", "--.-",".-.","...","-"
						, "..-", "...-", ".--", "-..-","-.--"
						, "--.." };

		String result="";

		for (int i=0; i < source.length(); i++ ) {
            // i가 0일 경우 charAt(0)은 S로, 'S'(83) - 'A'(65)는 18이다.
            // i가 1일 경우 charAt(1)은 O로, 'O'(79) - 'A'(65)는 14이다.
            // i가 2일 경우 charAt(2)은 S로, 'S'(83) - 'A'(65)는 18이다.
            // i가 3일 경우 charAt(3)은 H로, 'H'(72) - 'A'(65)는 7이다.
            // i가 4일 경우 charAt(4)은 E로, 'E'(69) - 'A'(65)는 4이다.
            // i가 5일 경우 charAt(5)은 L로, 'L'(76) - 'A'(65)는 11이다.
            // i가 6일 경우 charAt(6)은 P로, 'P'(80) - 'A'(65)는 15이다.
			result+=morse[source.charAt(i)-'A'];
		}
		System.out.println("source:"+ source);
		System.out.println("morse:"+result);
	}
}