/*
 * chapter 11-05. ��Ӱ� ������
 * - ������� ȣ�� : ���� Ŭ������ �����ڿ��� super() Ű���带 ���� �θ� Ŭ������ �����ڸ� ȣ��
 * - �������� ȣ�� : ���� ������� �ʾƵ� �ڵ����� �θ� Ŭ������ ����Ʈ ������ ȣ��
 */
package chapter11;

class Shape {
	public Shape(String msg) {
		System.out.println("Shape ������ " + msg);
	}
}

public class Rectangle extends Shape {
	public Rectangle() {
		// Shape Ŭ�������� ����Ʈ ������(Shape())�� ���� ������ �������� ȣ�� �� error �߻�
		super("From Rectangle");	// ������� ȣ��
		
		System.out.println("Rectangle ������");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
	}

}
