package 상속과포함;
class Point {
	int x;
	int y;
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3Dtest extends Point {
	int z;
	
	String getLocation() { // 오버라이딩
		return super.getLocation() + ", z :" + z; // 조상 메서드 호출
		
	}
}

public class Point3D {

	public static void main(String[] args) {
		Point3Dtest po = new Point3Dtest();
		po.x = 10;
		po.y = 15;
		po.z = 5;
		
		System.out.println(po.getLocation());
	}

}
