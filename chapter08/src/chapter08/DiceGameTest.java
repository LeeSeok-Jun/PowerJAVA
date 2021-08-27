/*
 * chapter 08-03. 메소드 호출의 예제
 */

package chapter08;

import java.util.*;


// 주사위 게임 클래스 정의
class DiceGame {
	
	// 필드 선언
	int diceFace;		// 주사위 결과
	int userGuess;		// 유저 추측
	
	
	// 메소드 선언
	private void RollDice() {
		// Math().random = 0 이상 1 미만의 무작위 수 반환
		diceFace = (int)(Math.random() * 6) + 1;
	}
	
	// 자바에서 인수 전달은 값에 의한 전달(Call by value)이다.
	// 실제 객체나 주소가 전달되는 것이 아니라 값이 복사되어 전달된다.
	private int getUserInput(String prompt) {
		System.out.print(prompt);
		Scanner input = new Scanner(System.in);
		
		return input.nextInt();
	}
	
	private void checkUserGuess() {
		if (diceFace == userGuess) {
			System.out.println("맞았습니다!");
		}
		else {
			System.out.println("틀렸습니다!");
		}
	}
	
	public void startPlaying() {
		int userGuess = getUserInput("예상 값을 입력하시오 : ");
		RollDice();			// 같은 클래스 안에서 호출할 경우 객체이름을 명시해서 호출하지 않아도 된다.
		checkUserGuess();
	}
}

public class DiceGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiceGame game = new DiceGame();
		
		game.startPlaying();
	}

}
