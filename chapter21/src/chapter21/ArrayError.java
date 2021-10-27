/*
 * chapter 21-01. 예외 처리란?
 * - 배열의 인덱스 범위 초과
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
			System.out.println("인덱스 범위 초과!");
		}
	}

}
