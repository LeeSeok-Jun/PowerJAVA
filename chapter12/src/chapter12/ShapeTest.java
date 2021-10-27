/*
 * chapter 12-04. 다형성
 */

package chapter12;

class Shape3 {
	protected int x, y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle3 extends Shape3 {
	private int width, height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle extends Shape3 {
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle2 extends Shape3 {
	private int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
}

public class ShapeTest {
	private static Shape3 arrayOfShapes[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		drawAll();
	}
	
	public static void init() {
		arrayOfShapes = new Shape3[3];
		// 다형성에 의해 Shape3 객체 배열에 모든 타입의 객체를 저장할 수 있다.
		arrayOfShapes[0] = new Rectangle3();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle2();
	}
	
	public static void drawAll() {
		for (int i = 0; i < arrayOfShapes.length; i++) {
			// 실제 가리키고 있는 객체에 따라 다른 메소드가 출력된다.
			arrayOfShapes[i].draw();
		}
	}

}
