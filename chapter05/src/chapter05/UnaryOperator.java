/*
 * chapter 05-04.
 */

package chapter05;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 1;
		
		System.out.println(x);	// 1
		System.out.println(y);	// 1
		
		int nextX = ++x;	// nextX = 2, x = 2
		int nextY = y++;	// nextY = 1, y = 2
		
		System.out.println(x);		// 2
		System.out.println(nextX);	// 2
		
		System.out.println(y);		// 2
		System.out.println(nextY);	// 1
	}

}
