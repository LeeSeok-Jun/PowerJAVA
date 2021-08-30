/*
 * chapter 09-02. ���� �޼ҵ�
 * ���� �޼ҵ�(static method) : Ŭ���� �̸��� ���Ͽ� ȣ��Ǵ� �޼ҵ�
 * - ��ü�� �������� ���� ���¿��� ȣ��Ǵ� �޼ҵ�
 * - ��ü �������� ����� �� ���� '���� ����'�� '���� ����'���� ����� �� �ִ�.
 * - ���� �޼ҵ� �ȿ��� ���� �޼ҵ带 ȣ���ϴ� ���� �����ϴ�.
 * - ��ü�� �������� �ʱ� ������ this Ű���� ��� �Ұ���
 */

package chapter09;

class Car3 {
	private int speed;
	private int mileage;
	private String color;
	
	private int id;			// �ڵ��� �ø��� ��ȣ
	
	// ���� ����
	// �ڵ����� ��(��ü�� ��)�� ��ü ��ü�� ����
	private static int numberOfCars	= 0;
	
	// ������
	public Car3(int s, int m, String c) {
		speed = s;
		mileage = m;
		color = c;
		
		id = ++numberOfCars;
	}
	
	// ���� �޼ҵ�
	public static int getNumberOfCars() {
		return numberOfCars;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 c1 = new Car3(100, 0, "blue");
		Car3 c2 = new Car3(0, 0, "white");
		
		int n = Car3.getNumberOfCars();	// ���� �޼ҵ� ȣ��
		
		System.out.println("���ݱ��� ������ �ڵ��� �� : " + n);
	}

}
