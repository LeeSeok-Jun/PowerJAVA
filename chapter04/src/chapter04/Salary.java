/*
 * chapter 04-04.
 */

package chapter04;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary; // ����
		int deposit; // �����
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�. : ");
		salary = input.nextInt();
		
		deposit = salary * 10 * 12;
		// printf() : ���ڿ��� ������ ���� ����� �� ���
		// %d : ������ ���
		// \n : �ٹٲ�
		System.out.printf("10�� ������ ����� : %d\n", deposit);
		
		return;
	}

}
