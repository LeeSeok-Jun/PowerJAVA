/*
 * chapter 06-03.
 */

package chapter06;

import java.util.*;

public class LoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i = 1;
		
		System.out.print("���ϴ� �ܼ��� �Է��Ͻÿ� : ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		while (i <= 9) {
			System.out.println(n + "*" + i + " = " + n*i);
			i++;
		}
		
		return;
	}

}
