/*
 * chapter 10-01. �迭�� ����� ���
 */

package chapter10;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		
		// error : �ε��� ������ 0~9�����̹Ƿ� 10�� ����� �� ����.
		numbers[10] = 0;	// ArrayIndexOutOfBoundsException �߻�
	}

}
