/*
 * chapter 09-05. Ŭ������ Ŭ���� ���� ����
 * ���(use) : �ϳ��� Ŭ������ �ٸ� Ŭ������ ����Ѵ�.
 * - Ŭ������ A�� �޼ҵ忡�� Ŭ���� B�� �޼ҵ���� ȣ���Ѵ�.
 * - ��ǥ������ Ŭ���� A���� B Ŭ���� ��ü�� �����Ͽ� ����ϴ� ���
 */

package chapter09;

// ���Ҽ��� ��Ÿ���� Ŭ����
public class Complex {
	private double real;
	private double imag;
	
	// ������
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
	
	// �������� Ư�� ���� : Ŭ������ �ڱ� �ڽ��� ��ü ������ �־ �Ű� ������ �޴� ����
	public Complex add(Complex c) {
		double resultReal = real + c.getReal();
		double resultImag = real + c.getImag();
		
		// ���ο� ��ü�� �����ؼ� ��ȯ
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
