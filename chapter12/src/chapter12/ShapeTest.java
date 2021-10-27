/*
 * chapter 12-04. ������
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
		// �������� ���� Shape3 ��ü �迭�� ��� Ÿ���� ��ü�� ������ �� �ִ�.
		arrayOfShapes[0] = new Rectangle3();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle2();
	}
	
	public static void drawAll() {
		for (int i = 0; i < arrayOfShapes.length; i++) {
			// ���� ����Ű�� �ִ� ��ü�� ���� �ٸ� �޼ҵ尡 ��µȴ�.
			arrayOfShapes[i].draw();
		}
	}

}
