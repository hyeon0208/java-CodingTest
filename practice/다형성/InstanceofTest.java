class InstanceofTest {
	public static void main(String args[]) {
		FireEngine3 fe = new FireEngine3();

		if(fe instanceof FireEngine3) {
			System.out.println("This is a FireEngine instance.");
		} 

		if(fe instanceof Car3) {
			System.out.println("This is a Car instance.");
		} 

		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		} 

		System.out.println(fe.getClass().getName()); // 클래스 이름 출력
	}
} 

class Car3 {}
class FireEngine3 extends Car3 {}