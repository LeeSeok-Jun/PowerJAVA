/*
 * chapter 10-01. 배열의 선언과 사용
 */

package chapter10;

import java.util.*;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바에서는 배열을 선언할 때, 배열의 크기를 지정하는 것을 금지한다.
		// 객체 생성할 때, 배열의 크기를 지정할 수 있다.
		int[] salary = new int[2];	// 길이가 2인 정수를 저장하는 배열 선언 및 객체 생성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("직원 1의 월급을 입력하시오 : ");
		salary[0] = input.nextInt();
		
		System.out.print("직원 2의 월급을 입력하시오 : ");
		salary[1] = input.nextInt();
		
		for (int i = 0; i < salary.length; i++) {
			System.out.println("직원 " + (i+1) + "의 월급은 " + salary[i] + "입니다.");
		}
	}

}
