/*
 * chapter 10-04. 객체들의 배열
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
		Car[] cars = new Car[NUM_CARS];		// 참조값을 저장할 수 있는 공간 생성(객체 생성X)
		
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();	// 실제 객체 생성
			cars[i].speedUp();
			System.out.println(cars[i]);
		}
	}

}
