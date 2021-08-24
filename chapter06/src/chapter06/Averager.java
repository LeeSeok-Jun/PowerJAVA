/*
 * chapter 06-05.
 * break문
 */

package chapter06;

import java.util.*;

public class Averager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		outer_loop:	// 반복문에 레이블을 달 수 있다.(제어 흐름)
		while (true) {
			System.out.print("졈수를 입력하시오 : ");
			int grade = input.nextInt();
			
			// 음수 입력 시 반복 종료
			if (grade < 0) {
				break outer_loop;	// break에 레이블을 명시하면 해당 반복문을 종료시킬 수 있다.
			}
			
			total += grade;
			count++;
		}
		System.out.println("평균은 " + total / count);
	}

}
