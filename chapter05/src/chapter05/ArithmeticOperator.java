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
		System.out.println(result);	// ������ ��꿡�� �Ҽ��� ���Ϻκ��� ��������.
		
		resultDouble = 3.0 / 2.0;
		System.out.println(resultDouble);
		resultDouble = 3.0 % 2.0;	// % : ������ ���
		System.out.println(resultDouble);	
		
		return;
	}

}
