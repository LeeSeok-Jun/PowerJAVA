/*
 * chapter 23-03. ������ Ȱ��
 * - sleep()�� CPU�� �ð��� �ٸ� �����忡�� �Ѱ��ִ� ȿ������ ���
 * - ���� ���·� �ִ� ���� ���ͷ�Ʈ�Ǹ� InterruptedExcetpion�� �߻��Ѵ�.
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
