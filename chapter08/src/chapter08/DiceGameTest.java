/*
 * chapter 08-03. �޼ҵ� ȣ���� ����
 */

package chapter08;

import java.util.*;


// �ֻ��� ���� Ŭ���� ����
class DiceGame {
	
	// �ʵ� ����
	int diceFace;		// �ֻ��� ���
	int userGuess;		// ���� ����
	
	
	// �޼ҵ� ����
	private void RollDice() {
		// Math().random = 0 �̻� 1 �̸��� ������ �� ��ȯ
		diceFace = (int)(Math.random() * 6) + 1;
	}
	
	// �ڹٿ��� �μ� ������ ���� ���� ����(Call by value)�̴�.
	// ���� ��ü�� �ּҰ� ���޵Ǵ� ���� �ƴ϶� ���� ����Ǿ� ���޵ȴ�.
	private int getUserInput(String prompt) {
		System.out.print(prompt);
		Scanner input = new Scanner(System.in);
		
		return input.nextInt();
	}
	
	private void checkUserGuess() {
		if (diceFace == userGuess) {
			System.out.println("�¾ҽ��ϴ�!");
		}
		else {
			System.out.println("Ʋ�Ƚ��ϴ�!");
		}
	}
	
	public void startPlaying() {
		int userGuess = getUserInput("���� ���� �Է��Ͻÿ� : ");
		RollDice();			// ���� Ŭ���� �ȿ��� ȣ���� ��� ��ü�̸��� ����ؼ� ȣ������ �ʾƵ� �ȴ�.
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
