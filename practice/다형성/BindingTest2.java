class BindingTest2 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();

		System.out.println("p.x = " + p.x); 
		p.method();

		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent3 {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}


// Child 클래스에는 아무런 멤버도 정의되어 있지 않아, 상속받은 멤버와 메서드만을 가진다.
class Child3 extends Parent3 { }