/*
 * chapter 12-05. 내부 클래스
 */

package chapter12;

class OuterClass {
	private String secret = "Time is money";
	
	public OuterClass() {
		InnerClass obj = new InnerClass();
		obj.print();
	}
	
	private class InnerClass {
		// 내부 클래스 생성자
		public InnerClass() {
			System.out.println("A InnerClass is created");
		}
		
		// 내부 클래스에서 외부 클래스의 private 변수나 메소드 사용 가능
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
