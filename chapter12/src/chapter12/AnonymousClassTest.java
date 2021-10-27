/*
 * chapter 12-06. 무명 클래스
 * - 몸체는 정의되지만 이름이 없는 일회성 클래스
 * - new 키워드 다음에 수퍼 클래스 이름이나 인터페이스 이름을 적는 방식으로 상속 가능
 */

package chapter12;

interface RemoteControl {
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl ac = new RemoteControl() {
			public void turnOn() {
				System.out.println("TV turns On");
			}
			
			public void turnOff() {
				System.out.println("TV turns Off");
			}
		};	// 무명 클래스는 괄호를 닫고 반드시 ;를 붙여야 한다!
		
		ac.turnOn();
		ac.turnOff();
	}


}
