/*
 * chapter 06-01.
 */

package chapter06;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int RATE = 5000; // 상수 선언
		int pay;	// 임금
		int hours;	// 시간
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("시간을 입력하시오 : ");
		hours = input.nextInt();
		
		if (hours > 8) {
			pay = RATE * 8 + (int) (1.5 * RATE * (hours - 8));
		}
		else {
			pay = RATE * 8;
		}
		
		System.out.printf("임금은 %d원 입니다.\n", pay);
	}

}
