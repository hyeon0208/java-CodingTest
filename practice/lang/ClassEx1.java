package lang;

final class Card {
	String kind;
	int num;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int num) {
		this.kind = kind;
		this.num  = num;
	}

	public String toString() {
		return kind + ":" + num;
	}
}

class ClassEx1 {
	public static void main(String[] args) throws Exception {
		Card c  = new Card("HEART", 3);       // new연산자로 객체 생성
		Card c2 = Card.class.newInstance();   // Class객체 Card를 통해서 객체 생성

			// class를 얻는다.
		Class cObj = c.getClass();

		System.out.println(c);
		System.out.println(c2);
		
			// 클래스의 이름을 얻는다.
		System.out.println(cObj.getName());
			// 클래스의 세부정보를 얻는다.
		System.out.println(cObj.toGenericString());
			// cobj를 문자열로 반환한다.
		System.out.println(cObj.toString());		
	}
}