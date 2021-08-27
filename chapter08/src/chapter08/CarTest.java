/*
 * chapter 08-01. 클래스와 객체
 */

package chapter08;

// Car 클래스 정의
class Car {
	// 필드 정의(변수)
	public int speed;		// 속도
	public int mileage;		// 주행거리
	public String color;	// 색상

	// 메소드 정의(함수)
	// 속도 증가 메소드
	public void speedUp() {
		speed += 10;
	}
	
	// 속도 감소 메소드
	public void speedDown() {
		speed -= 10;
	}
	
	// 객체 상태를 문자열로 출력하는 메소드
	public String toString() {
		return "속도 : " + speed + " 주행거리 : " + mileage + " 색상 : " + color;
	}
}


// 자바에서 하나의 소스 파일에 포함된 여러 개의 클래스 중에서 오직 하나의 클래스만이 public 수식자로 선언될 수 있다.
// public으로 선언되는 클래스는 반드시 소스 파일의 이름과 일치해야 한다.
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();		// 첫 번째 객체 생성
		Car yourCar = new Car();	// 두 번째 객체 생성
		
		// 첫 번째 객체 필드 변경
		// 필드를 외부에서 직접 접근하는 방법은 바람직하지 않다.
		myCar.speed = 60;
		myCar.mileage = 0;
		myCar.color = "blue";
		
		myCar.speedUp(); // 첫 번째 객체 메소드 호출
		System.out.println(myCar);	// 자동으로 toString() 메소드 실행된다.
		
		// 두 번째 객체 필드 변경
		yourCar.speed = 120;
		yourCar.mileage = 10;
		yourCar.color = "white";
		
		yourCar.speedDown(); // 두 번째 객체 메소드 호출
		System.out.println(yourCar);
		
		// 자바에서는 쓰레기 수집(Garbage collection)으로 사용이 끝난 객체를 자동으로 소멸시킨다.
		
		return;
		
	}

}
