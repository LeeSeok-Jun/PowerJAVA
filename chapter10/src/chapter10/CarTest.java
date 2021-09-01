/*
 * chapter 10-04. ��ü���� �迭
 */

package chapter10;

import java.util.*;

class Car {
	public int speed;
	public int mileage;
	public String color;
	
	public Car() {
		speed = mileage = 0;
		color = "red";
	}
	
	public void speedUp() {
		speed += 10;
	}
	
	public String toString() {
		return speed + " " + mileage + " " + color;
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];		// �������� ������ �� �ִ� ���� ����(��ü ����X)
		
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();	// ���� ��ü ����
			cars[i].speedUp();
			System.out.println(cars[i]);
		}
	}

}
