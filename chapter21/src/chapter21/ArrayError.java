/*
 * chapter 21-01. ���� ó����?
 * - �迭�� �ε��� ���� �ʰ�
 */

package chapter21;

public class ArrayError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5};
		int i = 0;
		
		try {
			for (i = 0; i <= array.length; i++) {
				System.out.print(array[i] + " ");
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ���� �ʰ�!");
		}
	}

}
