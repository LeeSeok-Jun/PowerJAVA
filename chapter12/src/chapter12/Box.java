/*
 * chapter 12-02. �������̽�
 * - ��� �޼ҵ尡 �߻� �޼ҵ��� �ش����� �߻� Ŭ����
 * - �������̽� ������ �ʵ�� ����� �� ����.
 * - �������̽��� �����ϴ� Ŭ������ �߻� �޼ҵ��� ��ü�� ��� �����Ͽ��� �Ѵ�.
 */

package chapter12;

public class Box implements Comparable {
	private double volume = 0;
	
	public Box(double v) {
		volume = v;
	}
	
	// �������̽��� �߻�޼ҵ� ����
	public int compareTo(Object otherObject) {
		// �Ű������� ���� Object���� ��ü�� ���� ���� ��ü�� ��ȯ
		Box other = (Box) otherObject;
		
		if (this.volume < other.volume) {
			return -1;
		}
		else if (this.volume > other.volume) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(100);
		Box b2 = new Box(85.0);
		
		if (b1.compareTo(b2) > 0) {
			System.out.println("b1 is bigger than b2");
		}
		else {
			System.out.println("b1 is not bigger than b2");
		}
	}

}
