/*
 * chapter 10-01. 배열의 선언과 사용
 */

package chapter10;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언과 동시에 초기화하기
		int[] numbers = {10, 20, 30};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
