/*
 * chapter 06-05.
 * break��
 */

package chapter06;

import java.util.*;

public class Averager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		outer_loop:	// �ݺ����� ���̺��� �� �� �ִ�.(���� �帧)
		while (true) {
			System.out.print("������ �Է��Ͻÿ� : ");
			int grade = input.nextInt();
			
			// ���� �Է� �� �ݺ� ����
			if (grade < 0) {
				break outer_loop;	// break�� ���̺��� ����ϸ� �ش� �ݺ����� �����ų �� �ִ�.
			}
			
			total += grade;
			count++;
		}
		System.out.println("����� " + total / count);
	}

}
