/*
 * chapter 21-03. ���ܿ� �޼ҵ�
 * - ����� ���� ���� ����
 * - ���ܵ� ��ü�̴�.
 */

package chapter21;

class MyException extends Exception {
	public MyException() {
		super("����� ���� ����");
	}
}

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		} catch (MyException e){
			System.err.println(e.getMessage() + "\n ȣ�� ���� ���� : ");
			e.printStackTrace();
		}
	}
	
	public static void method1() throws MyException {
		throw new MyException();
	}

}
