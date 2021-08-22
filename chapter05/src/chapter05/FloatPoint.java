/*
 * chapter 05-02.
 */

package chapter05;

public class FloatPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.141592; // 기호 상수
		
		double r1 = 123.5;
		double r2 = 1.2E-300;
		double r3 = 1.2E+300;
		
		System.out.println(PI);			// 3.141592
		
		System.out.println(0.0/0.0);	// NaN(Not a Number)
		System.out.println(r1/0.0);		// 오버플로우
		System.out.println(r2/r3);		// 언더플로우
		System.out.println(r3/r2);		// 오버플로우

		return;
	}

}
