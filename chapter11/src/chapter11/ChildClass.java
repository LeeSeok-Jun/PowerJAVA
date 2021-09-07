/*
 * chapter 11-03. �޼ҵ� ������
 * - super Ű����
 */

package chapter11;

class ParentClass {
	public int data = 100;
	
	public void print() {
		System.out.println("���� Ŭ������ print() �޼ҵ�");
	}
}


public class ChildClass extends ParentClass {
	public int data = 200;		// �θ� Ŭ������ ������ �̸��� �ʵ�
	
	@Override
	public void print()	{
		super.print(); 			// �θ� Ŭ������ print() ȣ��
		System.out.println("���� Ŭ������ print() �޼ҵ�");
		System.out.println(data);			// �ڽ� Ŭ������ �ʵ� ����
		System.out.println(super.data);		// �θ� Ŭ������ �ʵ� ����
		System.out.println(this.data);		// �ڽ� Ŭ������ �ʵ� ����
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		
		obj.print();

	}

}
