/*
 * chapter 23-03. 스레드 활용
 * - sleep()은 CPU의 시간을 다른 스레드에게 넘겨주는 효과적인 방법
 * - 수면 상태로 있는 동안 인터럽트되면 InterruptedExcetpion이 발생한다.
 */

package chapter23;

public class SleepTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String messages[] = {
				"Pride will have a fall.",
				"Power is dangerous unless you have humility.",
				"Office changes manners.",
				"Empty vessels make the most sound."
		};
		
		for (int i = 0; i < messages.length; i++) {
			Thread.sleep(1000);
			System.out.println(messages[i]);
		}
	}

}
