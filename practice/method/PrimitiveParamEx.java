class Data { int x; } // Data 클래스

class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data(); // Data 클래스를 이용해 d 객체 생성
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x); // change메서드의 매게변수 x의 값이 변경되어 원본에 영향x
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x); // 원본에 영향은 없이 x=10이 출력된다.
	}

	static void change(int x) {  // 기본형 매개변수. ( 변수에 저장된 값을 읽기면 할 수 있다. 변경 x)
		x = 1000;
		System.out.println("change() : x = " + x); // change 메서드의 x 값이 1000으로 저장
	}
}