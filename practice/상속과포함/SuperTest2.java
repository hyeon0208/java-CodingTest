package 상속과포함;
class SuperTest2 {
	public static void main(String args[]) {
		Child c = new Child();
		c.method();
	}
}
class Parent {
	int x=10;
}

class Child extends Parent {
	int x=20;

	void method() {
		System.out.println("x=" + x);
		
		// this는 자손 클래스에 선언된 멤버변수를 뜻한다. 20
		System.out.println("this.x=" + this.x);
		
		// super는 조상 클래스로 부터 상속받은 멤버변수를 뜻한다. 10
		System.out.println("super.x="+ super.x);
	}
}