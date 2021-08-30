/*
 * chapter 09-01. ������
 * �����ڴ� Ŭ���� �ȿ��� ����Ǿ ��ü�� ������ �� �ʵ忡�� �ʱⰪ�� �����ϰ� �ʿ��� �ʱ�ȭ ������ �����Ѵ�.
 * �޼ҵ�� ������ ���·� ���ǵ����� �̸��� Ŭ������ ���� ��ȯ���� ������ �ʴ´�.
 * �ݵ�� public���� ����Ǿ�� �ϸ� �ߺ� ����(Overloading)�� �����ϴ�.
 */

package chapter09;

class Car {
	// �ʵ� ����
	public int speed;		// �ӵ�
	public int mileage;		// ���� �Ÿ�
	public String color;	// ����
	
	// ù ��° ������
	public Car(int s, int m, String c) {
		speed = s;
		mileage = m;
		color = c;
	}
	
	// �� ��° ������(Overloading)
	public Car() {
		speed = mileage = 0;
		color = "red";
	}
	
	// ���� �־��� ������
	public Car(String c) {
		this(0, 0, c);	// ù ��° ������ ȣ��
	}
	
	public String toString() {
		return "�ӵ� : " + speed + " ���� �Ÿ� : " + mileage + " ���� : " + color;
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(100, 0, "blue");	// ù ��° ������ ȣ��
		Car c2 = new Car(); 				// �� ��° ������ ȣ��
		Car c3 = new Car("white");			// ���� �־��� ������ ȣ��
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

}
