package 생성자;
class Car {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수

	Car() { // 기본 생성자
		this("white", "auto", 4); // Car(String color, String gearType, int door)를 호출
	}

	Car(String color) { // 매개변수 생성자
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door) {
		this.color    = color;
		this.gearType = gearType;
		this.door     = door;
	}
}

class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();	// 기본 생성자 Car() 사용
		Car c2 = new Car("blue"); // 매개 변수 생성자 Car(String color) 사용

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}

