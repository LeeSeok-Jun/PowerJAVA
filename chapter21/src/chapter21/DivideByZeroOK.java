/*
 * chapter 21-01. ���� ó����?
 * - ��� ���� ó��
 */

package chapter21;

import java.util.*;

public class DivideByZeroOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�� ���� : ");
		x = input.nextInt();
		
		System.out.print("���� : ");
		y = input.nextInt();
		
		try {
			int result = x / y;
		}
		// ArithmeticException : java.lang�� ���ǵ� ��� ���ܿ� ���� Ŭ����
		catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		System.out.println("���α׷��� ��� ����˴ϴ�.");
		
		input.close();
	}

}
