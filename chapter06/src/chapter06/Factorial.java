/*
 * chapter 06-04.
 * For������ ���丮�� ����ϱ�
 */

package chapter06;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fact = 1;	// long : 64��Ʈ ��ȣ�ִ� ������ (int : 32��Ʈ ��ȣ�ִ� ������)
		int n;
		
		System.out.print("������ �Է��Ͻÿ�. : ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		System.out.println(n + "!�� " + fact +"�Դϴ�.");
	}

}
