/*
 * chapter 09-01. 생성자
 * 디폴트 생성자 : 클래스에 생성자를 하나도 정의하지 않았을 경우에 자동적으로 메소드의 몸체 부분이 비어있는 생성자가 만들어진다.
 */

package chapter09;

class Car1 {
	public int speed;
	public int mileage;
	public String color;
}

public class CarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c1 = new Car1();	// 디폴트 생성자 호출
		
		// 생성자가 하나라도 선언되어 있으면 디폴트 생성자가 자동으로 추가되지 않는다!
		// 매개 변수가 있는 생성자는 있고 디폴트 생성자는 정의하지 않은 상태에서 디폴트 생성자를 이용하여 객체 생성시 오류 발생!
	}

}
