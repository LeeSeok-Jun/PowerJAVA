/*
 * chapter 10-06. �迭�� ���� : ���İ� Ž��
 * - ���� ���� : �Է� �迭���� �ּҰ��� �߰��� ���� �� �ּҰ��� �� ������ ��ҵ�� ��ȯ�ϴ� ���
 */

package chapter10;

import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {5, 3, 8, 1, 2, 7};
		
		selectionSort(list);
	}
	
	public static void selectionSort(int[] list) {
		int temp;		// �迭 ������ ��ȯ�� ���� �ʿ��� �ӽ� �������
		int least;		// �迭 ���� ���� �ּڰ��� �ε����� ����
		
		for (int i = 0; i < list.length; i++) {
			least = i;
			
			// �ּڰ��� �ε��� Ž��
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[least]) {
					least = j;
				}
			}
			
			// i��° ��ҿ� least ��ġ�� ���� ��ȯ
			temp = list[i];
			list[i] = list[least];
			list[least] = temp;
		}
		
		// Arrays.toString() : �迭�� ���� ����� ���� ���̺귯��
		System.out.println(Arrays.toString(list));
	}

}
