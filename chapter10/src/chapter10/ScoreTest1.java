/*
 * chapter 10-03. 메소드와 배열
 * 메소드의 매개 변수로 배열 전달
 */

package chapter10;

import java.util.*;

public class ScoreTest1 {
	final static int STUDENTS = 5;	// 정적 변수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = new int[STUDENTS];
		
		getValues(scores);
		getAverage(scores);
	}
	
	// 정적 변수는 하나 밖에 선언하지 못하지만
	// 정적 메소드는 여러개 선언이 가능하다.
	// 정적 메소드를 호출하기 위해서는 객체 이름이 아닌 클래스 이름으로 접근해야 한다.
	private static void getValues(int[] array) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			array[i] = input.nextInt();
		}
	}
	
	private static void getAverage(int[] array) {
		int total = 0;
		
		for (int i : array) {
			total += i;
		}
		
		System.out.println("평균 성적은 " + (total / array.length) + "입니다.");
	}

}
