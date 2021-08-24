/*
 * chapter 06-04.
 * For문으로 팩토리얼 계산하기
 */

package chapter06;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fact = 1;	// long : 64비트 부호있는 정수형 (int : 32비트 부호있는 정수형)
		int n;
		
		System.out.print("정수를 입력하시오. : ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		System.out.println(n + "!는 " + fact +"입니다.");
	}

}
