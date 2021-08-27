/*
 * chapter 08-03. �ߺ� �޼ҵ�(Overloading)
 * �޼ҵ��� �̸��� ������ �Ű������� �ٸ��� �����Ͽ� ���
 * ��ȯ�����δ� ������ �� ����!
 */

package chapter08;

class Car1 {
	// �ʵ� ����
	private int speed;
	
	// �޼ҵ� ����
	// �ߺ� �޼ҵ� 1 : ������ �Ű�����
	public void setSpeed(int s) {
		speed = s;
		System.out.println("������ ȣ�� : " + speed);
	}
	
	// �ߺ� �޼ҵ� 2 : �Ǽ��� �Ű�����
	public void setSpeed(double s) {
		speed = (int) s;	// �ʵ尡 �������̹Ƿ� �μ��� int�� ����ȯ
		System.out.println("�Ǽ��� ȣ�� : " + speed);
	}
}

public class CarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 myCar = new Car1();
		
		// �Ű������� ���� ȣ��Ǵ� �޼ҵ尡 �ٸ���.
		myCar.setSpeed(100);
		myCar.setSpeed(79.2);
	}

}
