package 기본형과참조형;
public class OperatorEx15 {
    public static void main(String[] args) {
		char lowerCase = 'a';
		 // 대문자 A는 소문자 a보다 코드 값이 32가 작다.
		// 반대로 대문자를 소문자로 변환하려면 대문자의 코드 값에 32를 더해주면된다.
		char upperCase = (char) (lowerCase - 32); 
		System.out.println(upperCase);
		
	}

}
