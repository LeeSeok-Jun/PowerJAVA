/*
 * chapter 10-02. 배열의 사용예
 */

package chapter10;

import java.util.*;

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STUDENTS = 5;		// 상수 선언
		int total = 0;
		
		Scanner input = new Scanner(System.in);
		int[] scores = new int[STUDENTS];
		
		for (int i = 0; i < STUDENTS; i++) {
			System.out.print("성적을 입력하시오 : ");
			scores[i] = input.nextInt();
		}
		
		for (int i = 0; i < STUDENTS; i++) {
			total += scores[i];
		}
		
		input.close();	// Scanner 객체 소멸
		
		System.out.println("평균 성적은 " + (total / STUDENTS) + "입니다.");
	}

}
