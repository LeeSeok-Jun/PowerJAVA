/*
 * chapter 11-02. 상속 사용
 * - 상속은 is-a 관계이다. (Car is a vehicle.)
 * - has-a 관계는 상속으로 모델링할 수 없다. (클래스 안에 다른 클래스의 객체를 포함)
 */

package chapter11;

// 부모 클래스(Super class)
class Car {
	public int speed;
	public int gear;
	public String color;
	
	public void setGear(int newGear) {
		gear = newGear;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public void speedDown(int decrement) {
		speed -= decrement;
	}
}

// 자식 클래스(Sub class)
// Car 클래스를 상속 받는다.
class SportCar extends Car {
	// 새로운 필드 추가
	public boolean turbo;
	
	// 새로운 메소드 추가
	public void setTurbo(boolean newValue) {
		turbo = newValue;
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportCar c = new SportCar();
		
		c.color = "Red";		// 부모 클래스 필드 접근
		c.setGear(3);			// 부모 클래스 메소드 호출
		c.speedUp(100);
		c.speedDown(30);
		
		c.setTurbo(true); 		// 자식 클래스의 메소드 호출
	}

}
