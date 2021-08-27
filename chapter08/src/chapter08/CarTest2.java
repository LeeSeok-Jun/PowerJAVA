/*
 * chapter 08-04. 필드 선언
 * 접근자(Accessor)와 설정자(Mutator)
 */

package chapter08;

class Car2 {
	// 필드 선언
	private int speed;		// 속도
	private int mileage;	// 주행거리
	private String color;	// 색상
	
	// 접근자 선언
	public int getSpeed() {
		return speed;
	}
	
	// 설정자 선언
	// 설정자 메소드는 변수의 값을 변경하려는 외부의 시도를 주의깊게 검사 가능
	// 메소드 내의 조건문을 통해 올바르지 않은 값을 설정할 수 있음.
	public void setSpeed(int s) {
		// 속도가 음수로 입력되는 것을 예방
		if (s < 0) {
			speed = 0;
		}
		else {
			speed = s;
		}
	}
	
	// 접근자 선언
	public int getMileage() {
		return mileage;
	}
	
	// 설정자 선언
	public void setMileage(int m) {
		mileage = m;
	}
	
	// 접근자 선언
	public String getColor() {
		return color;
	}
	
	// 설정자 선언
	public void setColor(String c) {
		color = c;
	}
	
}

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 myCar = new Car2();
		
		// 설정자 메소드 호출
		myCar.setSpeed(100);
		myCar.setMileage(0);
		myCar.setColor("red");
		
		// 접근자 메소드 호출
		System.out.println("현재 자동차의 속도 : " + myCar.getSpeed());
		System.out.println("현재 자동차의 주행거리 : " + myCar.getMileage());
		System.out.println("현재 자동차의 색상 : " + myCar.getColor());
	}

}
