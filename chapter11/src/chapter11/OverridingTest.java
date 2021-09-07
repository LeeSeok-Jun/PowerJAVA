/*
 * chapter 11-03. 메소드 재정의(Overriding)
 * - 자식 클래스가 필요에 따라 상속된 메소드를 다시 정의하여 사용하는 것
 */

package chapter11;

class Animal {
	public void makeSound() {
		System.out.println("부모 클래스의 메소드입니다.");
	}
}

class Dog extends Animal {
	// @ 주해(Annotation)
	@Override
	public void makeSound() {
		System.out.println("멍!멍!");
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		
		d.makeSound();		// 자식 클래스에서 정의된 메소드 호출
	}

}
