/*
 * chapter 12-03. 인터페이스의 활용
 * - java에서는 클래스의 다중 상속이 불가능하다.
 * - 인터페이스를 활용하여 다중 상속의 효과를 낼 수 있다.
 * - 인터페이스에서 변수 선언은 불가능하지만 상수 선언은 가능하다!
 */
package chapter12;

class Shape2 {
	// protected : 동일 패키지 내 혹은 파생 클래스에서만 접근 가능
	protected int x, y;
}

interface Drawable {
	void draw();
}

public class Rectangle2 extends Shape2 implements Drawable {
	int width, height;
	
	public void draw() {
		System.out.println("Rectangle Draw!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle2 r2 = new Rectangle2();
		
		r2.draw();
		
	}

}
