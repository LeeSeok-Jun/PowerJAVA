/*
 * chapter 06-03.
 * do - while���� �̿��� ���� ���α׷�
 */

package chapter06;

import java.util.*;

public class LetterGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 59; // ����
		int guess;
		int tries = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("������ �����ϼ��� : ");
			guess = input.nextInt();
			tries++;
			
			if (guess > answer) {
				System.out.println("������ ������ ���亸�� �����ϴ�.");
			}
			else if (guess < answer) {
				System.out.println("������ ������ ���亸�� �����ϴ�.");
			}
		} while (guess != answer);
		
		System.out.println("�����մϴ�! " + tries + "�� ���� ������ ������ϴ�.");
		
		return;
	}

}
