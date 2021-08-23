/*
 * chapter 06-03.
 * 두 개 정수의 최대 공약수 구하기
 */

package chapter06;

import java.util.*;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, r;
		
		System.out.print("두 개의 정수를 입력하시오(큰 수, 작은 수): ");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		
		System.out.println("최대 공약수는 " + x + "입니다.");
		return;
	}

}
