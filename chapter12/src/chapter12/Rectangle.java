/*
 * chapter 11-01. �߻� Ŭ����
 * - �߻� Ŭ������ �߻� �޼ҵ带 �ϳ� �̻� ���Ծ� Ŭ������ �ǹ�����.
 * - ���� ��ü�� ������ �� ���.
 */

package chapter12;

// �߻� Ŭ���� ����
// �߻� Ŭ������ ��ü�� ������ �� ����.
abstract class Shape {
	int x, y;
	
	// �߻� Ŭ������ ������ ��ü�� ���� �� �ִ�.
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// �߻� �޼ҵ� ����
	// �߻� �޼ҵ带 �ϳ� �̻� ���� ��� �߻� Ŭ������ �ȴ�.
	public abstract void draw();
}

public class Rectangle extends Shape {
	int width, height;
	
	// �߻� Ŭ������ ��ӹ޾� �߻� �޼ҵ带 ���� �޼ҵ�� ����
	// �������� ���� ��� ������ ������ �߻��Ѵ�.
	public void draw() {
		System.out.println("�簢�� �׸��� �޼ҵ�");
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
		System.out.println("�� �׸��� �޼ҵ�");
	}
}