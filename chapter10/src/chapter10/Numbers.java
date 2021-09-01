/*
 * chapter 10-02. 배열의 사용예
 */

package chapter10;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*1000);		// 0~999 까지 무작위 수 저장
		}
		
		// for-each(자료형 변수 : 배열)
		// Python의 for 변수 in 배열 생각하면 이해하기 쉬움
		for (int value : numbers) {
			System.out.println(value);
		}
	}

}
