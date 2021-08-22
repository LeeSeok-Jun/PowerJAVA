/*
 * chapter 05-02.
 */

package chapter05;

public class FloatLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1 = 123.5;		// 64비트 실수형
		float r2 = 123.5F;		// 32비트 실수형(뒤에 'f' 혹은 'F'를 반드시 사용)
		double r3 = 1.235e2;	// 지수표기법 10^2
		double r4 = 1.235e-2;	// 지수표기법 10^-2
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		return;
	}

}
