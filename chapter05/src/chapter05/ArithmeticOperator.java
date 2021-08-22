/*
 * chapter 05-04.
 */

package chapter05;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		double resultDouble;
		
		result = 3 + 2;
		System.out.println(result);
		result = 3 - 2;
		System.out.println(result);
		result = 3 * 2;
		System.out.println(result);
		result = 3 / 2;
		System.out.println(result);	// 정수형 계산에서 소수점 이하부분은 버려진다.
		
		resultDouble = 3.0 / 2.0;
		System.out.println(resultDouble);
		resultDouble = 3.0 % 2.0;	// % : 나머지 계산
		System.out.println(resultDouble);	
		
		return;
	}

}
