/*
 * chapter 10-01. �迭�� ����� ���
 */

package chapter10;

import java.util.*;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڹٿ����� �迭�� ������ ��, �迭�� ũ�⸦ �����ϴ� ���� �����Ѵ�.
		// ��ü ������ ��, �迭�� ũ�⸦ ������ �� �ִ�.
		int[] salary = new int[2];	// ���̰� 2�� ������ �����ϴ� �迭 ���� �� ��ü ����
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� 1�� ������ �Է��Ͻÿ� : ");
		salary[0] = input.nextInt();
		
		System.out.print("���� 2�� ������ �Է��Ͻÿ� : ");
		salary[1] = input.nextInt();
		
		for (int i = 0; i < salary.length; i++) {
			System.out.println("���� " + (i+1) + "�� ������ " + salary[i] + "�Դϴ�.");
		}
	}

}
