/*
 * chapter 08-04. �ʵ� ����
 * ������(Accessor)�� ������(Mutator)
 */

package chapter08;

class Car2 {
	// �ʵ� ����
	private int speed;		// �ӵ�
	private int mileage;	// ����Ÿ�
	private String color;	// ����
	
	// ������ ����
	public int getSpeed() {
		return speed;
	}
	
	// ������ ����
	// ������ �޼ҵ�� ������ ���� �����Ϸ��� �ܺ��� �õ��� ���Ǳ�� �˻� ����
	// �޼ҵ� ���� ���ǹ��� ���� �ùٸ��� ���� ���� ������ �� ����.
	public void setSpeed(int s) {
		// �ӵ��� ������ �ԷµǴ� ���� ����
		if (s < 0) {
			speed = 0;
		}
		else {
			speed = s;
		}
	}
	
	// ������ ����
	public int getMileage() {
		return mileage;
	}
	
	// ������ ����
	public void setMileage(int m) {
		mileage = m;
	}
	
	// ������ ����
	public String getColor() {
		return color;
	}
	
	// ������ ����
	public void setColor(String c) {
		color = c;
	}
	
}

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 myCar = new Car2();
		
		// ������ �޼ҵ� ȣ��
		myCar.setSpeed(100);
		myCar.setMileage(0);
		myCar.setColor("red");
		
		// ������ �޼ҵ� ȣ��
		System.out.println("���� �ڵ����� �ӵ� : " + myCar.getSpeed());
		System.out.println("���� �ڵ����� ����Ÿ� : " + myCar.getMileage());
		System.out.println("���� �ڵ����� ���� : " + myCar.getColor());
	}

}
