/*
 * chapter 11-01. 추상 클래스
 * - 추상 클래스는 추상 메소드를 하나 이상 포함안 클래스를 의미힌다.
 * - 실제 객체를 생성할 수 잆다.
 */

package chapter12;

// 추상 클래스 선언
// 추상 클래스는 객체를 생성할 수 없다.
abstract class Shape {
	int x, y;
	
	// 추상 클래스도 보통의 객체를 가질 수 있다.
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상 메소드 선언
	// 추상 메소드를 하나 이상 가질 경우 추상 클래스가 된다.
	public abstract void draw();
}

public class Rectangle extends Shape {
	int width, height;
	
	// 추상 클래스를 상속받아 추상 메소드를 실제 메소드로 구현
	// 구현하지 않은 경우 컴파일 오류가 발생한다.
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		
		r.draw();
	}

}

class Circle extends Shape {
	int radius;
	public void draw() {
		System.out.println("원 그리기 메소드");
	}
}