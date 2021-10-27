/*
 * chapter 12-02. 인터페이스
 * - 모든 메소드가 추상 메소드인 극단적인 추상 클래스
 * - 인터페이스 내에서 필드는 선언될 수 없다.
 * - 인터페이스를 구현하는 클래스는 추상 메소드의 몸체를 모두 구현하여야 한다.
 */

package chapter12;

public class Box implements Comparable {
	private double volume = 0;
	
	public Box(double v) {
		volume = v;
	}
	
	// 인터페이스의 추상메소드 구현
	public int compareTo(Object otherObject) {
		// 매개변수로 받은 Object형의 객체를 같은 형의 객체로 변환
		Box other = (Box) otherObject;
		
		if (this.volume < other.volume) {
			return -1;
		}
		else if (this.volume > other.volume) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(100);
		Box b2 = new Box(85.0);
		
		if (b1.compareTo(b2) > 0) {
			System.out.println("b1 is bigger than b2");
		}
		else {
			System.out.println("b1 is not bigger than b2");
		}
	}

}
