/*
 * chapter 10-05. 2���� �迭�� �޼ҵ忡 �ѱ��
 */

package chapter10;

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { {10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120} };	// 2���� �迭 ���� �� �ʱ�ȭ
		
		printArray(array);
	}
	
	// main �Լ����� �����ؾ� �ϱ� ������ static �޼ҵ�� ����
	public static void printArray(int[][] array) {
		for (int r = 0; r < array.length; r++) {			// 2���� �迭 ��ü�� ���� �� ��ŭ �ݺ�
			for (int c = 0; c < array[r].length; c++) {		// 2���� �迭 �� �࿡ �ִ� ���� �� ��ŭ �ݺ�
				System.out.println(r + "�� " + c + "�� : " + array[r][c]);
			}
		}
	}

}
