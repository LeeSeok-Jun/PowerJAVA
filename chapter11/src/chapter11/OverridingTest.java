/*
 * chapter 11-03. �޼ҵ� ������(Overriding)
 * - �ڽ� Ŭ������ �ʿ信 ���� ��ӵ� �޼ҵ带 �ٽ� �����Ͽ� ����ϴ� ��
 */

package chapter11;

class Animal {
	public void makeSound() {
		System.out.println("�θ� Ŭ������ �޼ҵ��Դϴ�.");
	}
}

class Dog extends Animal {
	// @ ����(Annotation)
	@Override
	public void makeSound() {
		System.out.println("��!��!");
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		
		d.makeSound();		// �ڽ� Ŭ�������� ���ǵ� �޼ҵ� ȣ��
	}

}
