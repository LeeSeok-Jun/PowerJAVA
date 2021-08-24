/*
 * chapter 06-03.
 * do - while문을 이용한 게임 프로그램
 */

package chapter06;

import java.util.*;

public class LetterGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 59; // 정답
		int guess;
		int tries = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("정답을 추측하세요 : ");
			guess = input.nextInt();
			tries++;
			
			if (guess > answer) {
				System.out.println("제시한 정수가 정답보다 높습니다.");
			}
			else if (guess < answer) {
				System.out.println("제시한 정수가 정답보다 낮습니다.");
			}
		} while (guess != answer);
		
		System.out.println("축하합니다! " + tries + "번 만에 정답을 맞췄습니다.");
		
		return;
	}

}
