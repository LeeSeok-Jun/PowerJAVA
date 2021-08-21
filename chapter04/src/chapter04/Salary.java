/*
 * chapter 04-04.
 */

package chapter04;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary; // 월급
		int deposit; // 저축액
		Scanner input = new Scanner(System.in);
		
		System.out.print("월급을 입력하시오. : ");
		salary = input.nextInt();
		
		deposit = salary * 10 * 12;
		// printf() : 문자열과 변수를 같이 출력할 때 사용
		// %d : 정수형 출력
		// \n : 줄바꿈
		System.out.printf("10년 동안의 저축액 : %d\n", deposit);
		
		return;
	}

}
