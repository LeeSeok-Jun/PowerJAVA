/*
 * chapter 10-01. 배열의 선언과 사용
 */

package chapter10;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		
		// error : 인덱스 범위는 0~9까지이므로 10은 사용할 수 없다.
		numbers[10] = 0;	// ArrayIndexOutOfBoundsException 발생
	}

}
