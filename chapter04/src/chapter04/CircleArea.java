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
		
		System.out.print("�������� �Է��Ͻÿ�. : ");
		radius = input.nextDouble();
		
		area = radius * radius * 3.14;
		
		System.out.printf("�������� %f �Դϴ�.", area);
	}

}
