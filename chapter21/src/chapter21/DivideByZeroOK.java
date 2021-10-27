/*
 * chapter 21-01. 예외 처리란?
 * - 산술 예외 처리
 */

package chapter21;

import java.util.*;

public class DivideByZeroOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("피 젯수 : ");
		x = input.nextInt();
		
		System.out.print("젯수 : ");
		y = input.nextInt();
		
		try {
			int result = x / y;
		}
		// ArithmeticException : java.lang에 정의된 산술 예외에 관한 클래스
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("프로그램은 계속 진행됩니다.");
		
		input.close();
	}

}
