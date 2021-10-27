/*
 * chapter 23-03. ������ Ȱ��
 * - interrupt()�� join()�� Ȱ��
 */

package chapter23;

public class ThreadControl {
	static void print(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s : %s%n", threadName, message);
	}
	
	// ���� Ŭ���� ����
	private static class MessageLoop implements Runnable {
		public void run() {
			String messages[] = {
					"Pride will have a fall.",
					"Power is dangerous unless you have humility.",
					"Office changes manners.",
					"Empty vessels make the most sound."
			};
			
			// 2�� �������� ���ڿ� ���
			try {
				for (int i = 0; i < messages.length; i++) {
					print(messages[i]);
					Thread.sleep(2000);
				}
				
			// ���ͷ�Ʈ �߻� �� �޼��� ���
			} catch (InterruptedException e) {
				print("���� ������ �ʾҾ��!");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int tries = 0;
		
		// ������� main ������� t ������ 2���� ������.
		print("�߰����� �����带 �����մϴ�.");
		Thread t = new Thread(new MessageLoop());
		// t ������ �۾� ����
		t.start();
		
		print("�߰����� �����尡 �����⸦ ��ٸ��ϴ�.");
		while (t.isAlive()) {
			print("���� ��ٸ��ϴ�.");
			// ������ t�� �����⸦ 1�� ���� ��ٸ���.
			t.join(1000);
			tries++;
			
			// ������ t�� ������ �����Ų��.
			if (tries > 2) {
				print("���� �� �����!");
				t.interrupt();
				t.join();
			}
		}
		print("���� ������ ����!");
	}

}
