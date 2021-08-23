/*
 * chapter 06-02.
 */

package chapter06;

import java.util.*;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		int year = 2009;
		int days = 0;
		
		System.out.print("일수를 알고 싶은 달을 입력하시오 : ");
		Scanner input = new Scanner(System.in);
		month = input.nextInt();
		
		// switch의 조건은 정수형에 대해서만 동작한다.
		// month가 정수형이므로 동작할 수 있으며 범위를 나타내는 경우에는 if-else문 사용
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			// 윤년인 경우
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
				days = 29;
			}
			else {
				days = 28;
			}
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		
		System.out.println(month + "월의 일수는 " + days + "일 입니다.");
	}

}
