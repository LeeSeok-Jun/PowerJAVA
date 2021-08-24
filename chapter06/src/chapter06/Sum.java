/*
 * chapter 06-04.
 * For문으로 1부터 10까지의 정수 합 구하기
 */

package chapter06;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
