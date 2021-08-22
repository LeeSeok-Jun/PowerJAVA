/*
 * chapter 05-07.
 */

package chapter05;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double f;
		
		f = 5 / 4;
		System.out.println(f);	// 1.0
		
		f = (double) 5 / 4;		// 5.0 / 4 -> 자동적인 형변환 발생
		System.out.println(f);	// 1.25
		
		f = 5 / (double) 4;		// 5 / 4.0 -> 자동적인 형변환 발생
		System.out.println(f);	// 1.25
		
		f = (double) 5 / (double) 4;
		System.out.println(f);
		
		i = (int) 1.3 + (int) 1.8; // 축소 형변환으로 인해 1+1
		System.out.println(i);	// 2
	}

}
