/*
 * chapter 06-01.
 */

package chapter06;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int RATE = 5000; // ��� ����
		int pay;	// �ӱ�
		int hours;	// �ð�
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ð��� �Է��Ͻÿ� : ");
		hours = input.nextInt();
		
		if (hours > 8) {
			pay = RATE * 8 + (int) (1.5 * RATE * (hours - 8));
		}
		else {
			pay = RATE * 8;
		}
		
		System.out.printf("�ӱ��� %d�� �Դϴ�.\n", pay);
	}

}