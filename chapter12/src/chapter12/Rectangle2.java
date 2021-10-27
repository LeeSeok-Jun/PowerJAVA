/*
 * chapter 12-03. �������̽��� Ȱ��
 * - java������ Ŭ������ ���� ����� �Ұ����ϴ�.
 * - �������̽��� Ȱ���Ͽ� ���� ����� ȿ���� �� �� �ִ�.
 * - �������̽����� ���� ������ �Ұ��������� ��� ������ �����ϴ�!
 */
package chapter12;

class Shape2 {
	// protected : ���� ��Ű�� �� Ȥ�� �Ļ� Ŭ���������� ���� ����
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
