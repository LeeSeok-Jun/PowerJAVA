/*
 * chapter 04-04.
 */

package chapter04;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		double area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("반지름을 입력하시오. : ");
		radius = input.nextDouble();
		
		area = radius * radius * 3.14;
		
		System.out.printf("반지름은 %f 입니다.", area);
	}

}
