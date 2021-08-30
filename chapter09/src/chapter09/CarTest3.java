/*
 * chapter 09-02. 정적 메소드
 * 정적 메소드(static method) : 클래스 이름을 통하여 호출되는 메소드
 * - 객체가 생성되지 않은 상태에서 호출되는 메소드
 * - 객체 변수들은 사용할 수 없고 '정적 변수'와 '지역 변수'만을 사용할 수 있다.
 * - 정적 메소드 안에서 정적 메소드를 호출하는 것이 가능하다.
 * - 객체가 생성되지 않기 때문에 this 키워드 사용 불가능
 */

package chapter09;

class Car3 {
	private int speed;
	private int mileage;
	private String color;
	
	private int id;			// 자동차 시리얼 번호
	
	// 정적 변수
	// 자동차의 수(객체의 수)를 전체 객체가 공유
	private static int numberOfCars	= 0;
	
	// 생성자
	public Car3(int s, int m, String c) {
		speed = s;
		mileage = m;
		color = c;
		
		id = ++numberOfCars;
	}
	
	// 정적 메소드
	public static int getNumberOfCars() {
		return numberOfCars;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 c1 = new Car3(100, 0, "blue");
		Car3 c2 = new Car3(0, 0, "white");
		
		int n = Car3.getNumberOfCars();	// 정적 메소드 호출
		
		System.out.println("지금까지 생성된 자동차 수 : " + n);
	}

}
