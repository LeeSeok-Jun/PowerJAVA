/*
 * chapter 11-03. 메소드 재정의
 * - super 키워드
 */

package chapter11;

class ParentClass {
	public int data = 100;
	
	public void print() {
		System.out.println("수퍼 클래스의 print() 메소드");
	}
}


public class ChildClass extends ParentClass {
	public int data = 200;		// 부모 클래스와 동일한 이름의 필드
	
	@Override
	public void print()	{
		super.print(); 			// 부모 클래스의 print() 호출
		System.out.println("서브 클래스의 print() 메소드");
		System.out.println(data);			// 자식 클래스의 필드 참조
		System.out.println(super.data);		// 부모 클래스의 필드 참조
		System.out.println(this.data);		// 자식 클래스의 필드 참조
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		
		obj.print();

	}

}
