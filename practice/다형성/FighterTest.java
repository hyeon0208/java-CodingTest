class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();

		if (f instanceof Unit)	{		
			System.out.println("f는 Unit클래스의 자손입니다.");
		}
		if (f instanceof Fightable) {	
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		}
		if (f instanceof Movable) {		
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		}
		if (f instanceof Attackable) {	
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		}
		if (f instanceof Object) {		
			System.out.println("f는 Object클래스의 자손입니다.");
		}
	}
}

// Unit 클래스를 상속받고, Fightable 인터페이스를 구현한다.
class Fighter extends Unit implements Fightable {
	// 조상의 메서드보다 넓은 범위의 접근 제어자를 사용해야하기 때문에 public을 붙여야 한다.
	public void move(int x, int y) { /* 내용 생략 */ }
	public void attack(Unit u) { /* 내용 생략 */ }
}

class Unit {
	int currentHP;	// 유닛의 체력
	int x;			// 유닛의 위치(x좌표)
	int y;			// 유닛의 위치(y좌표)
}

// 인터페이스는 다중 상속이 가능하다.
interface Fightable extends Movable, Attackable { }
interface Movable {	public abstract void move(int x, int y);	}
interface Attackable {	public abstract void attack(Unit u); }