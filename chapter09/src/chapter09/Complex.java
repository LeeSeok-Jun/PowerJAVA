/*
 * chapter 09-05. 클래스와 클래스 간의 관계
 * 사용(use) : 하나의 클래스가 다른 클래스를 사용한다.
 * - 클래스가 A의 메소드에서 클래스 B의 메소드들을 호출한다.
 * - 대표적으로 클래스 A에서 B 클래스 객체를 생성하여 사용하는 경우
 */

package chapter09;

// 복소수를 나타내는 클래스
public class Complex {
	private double real;
	private double imag;
	
	// 생성자
	public Complex(double r, double i) {
		real = r;
		imag = i;
	}
	
	double getReal() {
		return real;
	}
	
	double getImag() {
		return imag;
	}
	
	// 사용관계의 특이 형태 : 클래스가 자기 자신을 객체 참조에 있어서 매개 변수로 받는 형태
	public Complex add(Complex c) {
		double resultReal = real + c.getReal();
		double resultImag = real + c.getImag();
		
		// 새로운 객체로 생성해서 반환
		return new Complex(resultReal, resultImag);
	}
	
	public String toString() {
		return real + "+" + imag + "i";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(1.0, 2.0);
		Complex c2 = new Complex(3.0, 4.0);
		
		Complex c3 = c1.add(c2);
		
		System.out.println(c3);
	}

}
