/*
 * chapter 10-03. �޼ҵ�� �迭
 * �޼ҵ��� �Ű� ������ �迭 ����
 */

package chapter10;

import java.util.*;

public class ScoreTest1 {
	final static int STUDENTS = 5;	// ���� ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = new int[STUDENTS];
		
		getValues(scores);
		getAverage(scores);
	}
	
	// ���� ������ �ϳ� �ۿ� �������� ��������
	// ���� �޼ҵ�� ������ ������ �����ϴ�.
	// ���� �޼ҵ带 ȣ���ϱ� ���ؼ��� ��ü �̸��� �ƴ� Ŭ���� �̸����� �����ؾ� �Ѵ�.
	private static void getValues(int[] array) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			array[i] = input.nextInt();
		}
	}
	
	private static void getAverage(int[] array) {
		int total = 0;
		
		for (int i : array) {
			total += i;
		}
		
		System.out.println("��� ������ " + (total / array.length) + "�Դϴ�.");
	}

}
