class BindingTest{
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();

		System.out.println("p.x = " + p.x); // p의 x값은 참조변수 타입 Parent에 x 값을 가진다.
		p.method(); // 메서드는 실제 인스턴스 타입인 child 메서드가 호출된다.

		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}
}