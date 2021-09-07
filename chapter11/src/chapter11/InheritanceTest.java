/*
 * chapter 11-02. ��� ���
 * - ����� is-a �����̴�. (Car is a vehicle.)
 * - has-a ����� ������� �𵨸��� �� ����. (Ŭ���� �ȿ� �ٸ� Ŭ������ ��ü�� ����)
 */

package chapter11;

// �θ� Ŭ����(Super class)
class Car {
	public int speed;
	public int gear;
	public String color;
	
	public void setGear(int newGear) {
		gear = newGear;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public void speedDown(int decrement) {
		speed -= decrement;
	}
}

// �ڽ� Ŭ����(Sub class)
// Car Ŭ������ ��� �޴´�.
class SportCar extends Car {
	// ���ο� �ʵ� �߰�
	public boolean turbo;
	
	// ���ο� �޼ҵ� �߰�
	public void setTurbo(boolean newValue) {
		turbo = newValue;
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportCar c = new SportCar();
		
		c.color = "Red";		// �θ� Ŭ���� �ʵ� ����
		c.setGear(3);			// �θ� Ŭ���� �޼ҵ� ȣ��
		c.speedUp(100);
		c.speedDown(30);
		
		c.setTurbo(true); 		// �ڽ� Ŭ������ �޼ҵ� ȣ��
	}

}
