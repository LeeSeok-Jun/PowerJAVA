/*
 * chapter 09-01. 생성자
 * 생성자는 클래스 안에서 선언되어서 객체가 생성될 때 필드에게 초기값을 제공하고 필요한 초기화 절차를 실행한다.
 * 메소드와 유사한 형태로 정의되지만 이름이 클래스와 같고 반환값을 가지지 않는다.
 * 반드시 public으로 선언되어야 하며 중복 정의(Overloading)가 가능하다.
 */

package chapter09;

class Car {
	// 필드 선언
	public int speed;		// 속도
	public int mileage;		// 주행 거리
	public String color;	// 색상
	
	// 첫 번째 생성자
	public Car(int s, int m, String c) {
		speed = s;
		mileage = m;
		color = c;
	}
	
	// 두 번째 생성자(Overloading)
	public Car() {
		speed = mileage = 0;
		color = "red";
	}
	
	// 색상만 주어진 생성자
	public Car(String c) {
		this(0, 0, c);	// 첫 번째 생성자 호출
	}
	
	public String toString() {
		return "속도 : " + speed + " 주행 거리 : " + mileage + " 색상 : " + color;
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(100, 0, "blue");	// 첫 번째 생성자 호출
		Car c2 = new Car(); 				// 두 번째 생성자 호출
		Car c3 = new Car("white");			// 색상만 주어진 생성자 호출
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

}
