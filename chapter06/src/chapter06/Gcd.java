/*
 * chapter 06-03.
 * �� �� ������ �ִ� ����� ���ϱ�
 */

package chapter06;

import java.util.*;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, r;
		
		System.out.print("�� ���� ������ �Է��Ͻÿ�(ū ��, ���� ��): ");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		
		System.out.println("�ִ� ������� " + x + "�Դϴ�.");
		return;
	}

}
