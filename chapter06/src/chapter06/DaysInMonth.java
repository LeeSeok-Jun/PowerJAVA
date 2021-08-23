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
		
		System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ� : ");
		Scanner input = new Scanner(System.in);
		month = input.nextInt();
		
		// switch�� ������ �������� ���ؼ��� �����Ѵ�.
		// month�� �������̹Ƿ� ������ �� ������ ������ ��Ÿ���� ��쿡�� if-else�� ���
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
			// ������ ���
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
				days = 29;
			}
			else {
				days = 28;
			}
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
		
		System.out.println(month + "���� �ϼ��� " + days + "�� �Դϴ�.");
	}

}
