class DefaultMethodTest {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method1();
		c.method2();
		MyInterface.staticMethod(); 
		MyInterface2.staticMethod();
	}
}

class Child2 extends Parent2 implements MyInterface, MyInterface2 {
	public void method1() {	
		System.out.println("method1() in Child");
	}			
}

class Parent2 {
	public void method2() {	
		System.out.println("method2() in Parent");
	}
}

interface MyInterface {
	default void method1() { 
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() { 
		System.out.println("method2() in MyInterface");
	}

	static  void staticMethod() { 
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	// 인터페이스는 메서드를 정의할 수 없지만 default 메서드로 정의 가능하다.
	default void method1() { 
		System.out.println("method1() in MyInterface2");
	}

	static  void staticMethod() { 
		System.out.println("staticMethod() in MyInterface2");
	}
}