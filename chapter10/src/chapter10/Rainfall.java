/*
 * chapter 10-05. 2���� �迭
 */
package chapter10;

import java.util.*;

public class Rainfall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int YEARS = 3;
		final int QUARTERS = 4;
		
		double[][] rain = new double[YEARS][QUARTERS];	// 3�� 4�� ������ 2���� �迭
		Scanner input = new Scanner(System.in);
		
		for (int y = 0; y < YEARS; y++) {
			for (int q = 0; q < QUARTERS; q++) {
				System.out.print(y + "���⵵ " + q + "�б� �������� �Է��Ͻÿ� : ");
				rain[y][q] = input.nextDouble();
			}
		}
		
		for (int y = 0; y < YEARS; y++) {
			double total = 0;	// �ݺ��� �ȿ��� ����� ������ �ݺ����� ������ ������ ������.
			
			for (int q = 0; q < QUARTERS; q++) {
				total += rain[y][q];
			}
			
			System.out.println(y + "���⵵ �������� " + total);
		}
		
		input.close();	// ��ü �Ҹ�
	
	}

}
