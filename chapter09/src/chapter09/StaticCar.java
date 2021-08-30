/*
 * chapter 09-02. 정적 변수와 정적 메소드
 * 정적 변수(static variable) : 하나의 클래스에 하나만 존재하며 그 클래스의 모든 객체들에 의해 공유되는 변수
 */

package chapter09;

public class StaticCar {
	private int speed;
	private int mileage;
	private String color;
	
	private int id;			// 자동차 시리얼 번호
	
	// 정적 변수
	// 자동차의 수(객체의 수)를 전체 객체가 공유
	private static int numberOfCars	= 0;
	
	// 생성자
	public StaticCar(int s, int m, String c) {
		speed = s;
		mileage = m;
		color = c;
		
		// 자동차 시리얼 번호는 지금까지 만들어온 차동차의 개수 + 1
		id = ++numberOfCars;
	}
	
	public String toString() {
		return speed + " " + mileage + " " + color + " " + id;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticCar sc1 = new StaticCar(100, 50000, "black");
		StaticCar sc2 = new StaticCar(90, 40000, "white");
		StaticCar sc3 = new StaticCar(80, 30000, "gray");
		
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc3);
	}

}
