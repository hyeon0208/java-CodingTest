class Data { int x; }

public class ReferenceParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);

	}

    	// static을 붙이면 객체 생성 생략 가능, void는 return 생략 가능
	static void change(Data d) { // 참조형 매개변수 (Data 클래스를 참조)
		d.x = 1000;
		System.out.println("change() : x = " + d.x); // d 객체의 x 값을 1000으로 변경
	}

}
