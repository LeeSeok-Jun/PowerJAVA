/*
 * chapter 11-05. 상속과 생성자
 * - 명시적인 호출 : 서브 클래스의 생성자에서 super() 키워드를 통해 부모 클래스의 생성자를 호출
 * - 묵시적인 호출 : 따로 명시하지 않아도 자동으로 부모 클래스의 디폴트 생성자 호출
 */
package chapter11;

class Shape {
	public Shape(String msg) {
		System.out.println("Shape 생성자 " + msg);
	}
}

public class Rectangle extends Shape {
	public Rectangle() {
		// Shape 클래스에는 디폴트 생성자(Shape())가 없기 때문에 묵시적인 호출 시 error 발생
		super("From Rectangle");	// 명시적인 호출
		
		System.out.println("Rectangle 생성자");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
	}

}
