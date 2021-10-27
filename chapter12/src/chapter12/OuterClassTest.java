/*
 * chapter 12-05. ���� Ŭ����
 */

package chapter12;

class OuterClass {
	private String secret = "Time is money";
	
	public OuterClass() {
		InnerClass obj = new InnerClass();
		obj.print();
	}
	
	private class InnerClass {
		// ���� Ŭ���� ������
		public InnerClass() {
			System.out.println("A InnerClass is created");
		}
		
		// ���� Ŭ�������� �ܺ� Ŭ������ private ������ �޼ҵ� ��� ����
		public void print() {
			System.out.println(secret);
		}
	}
}

public class OuterClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OuterClass();
	}

}
