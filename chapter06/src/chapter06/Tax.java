/*
 * chapter 06-01.
 */

package chapter06;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int income; // 과세표준
		int tax; 	// 세금
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("과세 표준 금액을 입력하시오 : ");
		income = input.nextInt();
		
		if (income <= 1000) {
			tax = (int) (0.09 * income);
		}
		else if (income <= 4000) {
			tax = (int) (0.18 * income);
		}
		else if (income < 8000) {
			tax = (int) (0.27 * income);
		}
		else {
			tax = (int) (0.36 * income);
		}
		
		System.out.println("소득세는 " + tax + "입니다.");
		
		return;
	}

}
