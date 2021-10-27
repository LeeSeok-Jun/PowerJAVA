/*
 * chapter 12-06. ���� Ŭ����
 * - ��ü�� ���ǵ����� �̸��� ���� ��ȸ�� Ŭ����
 * - new Ű���� ������ ���� Ŭ���� �̸��̳� �������̽� �̸��� ���� ������� ��� ����
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
		};	// ���� Ŭ������ ��ȣ�� �ݰ� �ݵ�� ;�� �ٿ��� �Ѵ�!
		
		ac.turnOn();
		ac.turnOff();
	}


}
