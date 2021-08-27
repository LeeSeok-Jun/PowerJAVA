/*
 * chapter 08-01. Ŭ������ ��ü
 */

package chapter08;

// Car Ŭ���� ����
class Car {
	// �ʵ� ����(����)
	public int speed;		// �ӵ�
	public int mileage;		// ����Ÿ�
	public String color;	// ����

	// �޼ҵ� ����(�Լ�)
	// �ӵ� ���� �޼ҵ�
	public void speedUp() {
		speed += 10;
	}
	
	// �ӵ� ���� �޼ҵ�
	public void speedDown() {
		speed -= 10;
	}
	
	// ��ü ���¸� ���ڿ��� ����ϴ� �޼ҵ�
	public String toString() {
		return "�ӵ� : " + speed + " ����Ÿ� : " + mileage + " ���� : " + color;
	}
}


// �ڹٿ��� �ϳ��� �ҽ� ���Ͽ� ���Ե� ���� ���� Ŭ���� �߿��� ���� �ϳ��� Ŭ�������� public �����ڷ� ����� �� �ִ�.
// public���� ����Ǵ� Ŭ������ �ݵ�� �ҽ� ������ �̸��� ��ġ�ؾ� �Ѵ�.
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();		// ù ��° ��ü ����
		Car yourCar = new Car();	// �� ��° ��ü ����
		
		// ù ��° ��ü �ʵ� ����
		// �ʵ带 �ܺο��� ���� �����ϴ� ����� �ٶ������� �ʴ�.
		myCar.speed = 60;
		myCar.mileage = 0;
		myCar.color = "blue";
		
		myCar.speedUp(); // ù ��° ��ü �޼ҵ� ȣ��
		System.out.println(myCar);	// �ڵ����� toString() �޼ҵ� ����ȴ�.
		
		// �� ��° ��ü �ʵ� ����
		yourCar.speed = 120;
		yourCar.mileage = 10;
		yourCar.color = "white";
		
		yourCar.speedDown(); // �� ��° ��ü �޼ҵ� ȣ��
		System.out.println(yourCar);
		
		// �ڹٿ����� ������ ����(Garbage collection)���� ����� ���� ��ü�� �ڵ����� �Ҹ��Ų��.
		
		return;
		
	}

}
