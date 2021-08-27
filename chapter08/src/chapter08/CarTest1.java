/*
 * chapter 08-03. 중복 메소드(Overloading)
 * 메소드의 이름은 같지만 매개변수를 다르게 설정하여 사용
 * 반환값으로는 구분할 수 없다!
 */

package chapter08;

class Car1 {
	// 필드 선언
	private int speed;
	
	// 메소드 선언
	// 중복 메소드 1 : 정수형 매개변수
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수형 호출 : " + speed);
	}
	
	// 중복 메소드 2 : 실수형 매개변수
	public void setSpeed(double s) {
		speed = (int) s;	// 필드가 정수형이므로 인수를 int로 형변환
		System.out.println("실수형 호출 : " + speed);
	}
}

public class CarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 myCar = new Car1();
		
		// 매개변수에 따라 호출되는 메소드가 다르다.
		myCar.setSpeed(100);
		myCar.setSpeed(79.2);
	}

}
