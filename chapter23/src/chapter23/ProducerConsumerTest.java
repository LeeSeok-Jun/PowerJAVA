/*
 * chapter 23-05. ������ ���� ����
 * - ������-�Һ��� ����
 */

package chapter23;

// �ɟ��� �ӽ������� �����ϴ� Ŭ����
// �ش� ��ü�� �� ���� �����尡 �����ϰ� �ȴ�.
class Buffer {
	private int data;	// ������ -> �Һ��ڷ� �������� ������
	
	// true : �ɟ��� ������ �Һ��ڰ� �����ڸ� ��ٸ�
	// false : �ɟ��� ������ �����ڰ� �Һ��ڸ� ��ٸ�
	private boolean empty = true;
	
	// �ɟ� �Һ�
	public synchronized int get() {
		// �ɟ��� ����Ǹ� empty�� false�� ����
		while (empty) {
			try {
				wait();	// �ɟ��� ����� �� ���� ��ٸ�
			} catch (InterruptedException e) {
				
			}
		}
		
		empty = true;	// �ɟ��� �Һ��ڰ� ���������� �ٽ� �� ���·� ����
		notifyAll();	// �����ڸ� ������ �ɟ��� �����ϰ� ��
		
		return data;
	}
	
	// �ɟ� ����
	public synchronized void put(int data) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		
		empty = false;
		this.data = data;
		notifyAll();
	}
}

// ������
// �ɟ��� ������ �Ŀ� ���� �ð���ŭ �޽��� ���Ѵ�.
class Producer implements Runnable {
	private Buffer buffer;
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			buffer.put(i);	// buffer ��ü�� �ϼ��� �ɟ��� ������ ����
			
			System.out.println("������ : " + i + "�� �ɟ��� �����Ͽ����ϴ�.");
			
			try {
				Thread.sleep((int) (Math.random() * 100));	// ���� �ð���ŭ �޽�
			} catch (InterruptedException e) {
				
			}
		}
	}
}

// �Һ���
class Consumer implements Runnable {
	private Buffer buffer;	// ���� ���������� ����
	
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			int data = buffer.get();	// buffer ��ü�� �ִ� �ɟ��� ������
			System.out.println("�Һ��� : " + i + "�� �ɟ��� �Һ��Ͽ����ϴ�.");
			
			try {
				Thread.sleep((int) (Math.random() * 100));	
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class ProducerConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer buffer = new Buffer();
		
		(new Thread(new Producer(buffer))).start();
		(new Thread(new Consumer(buffer))).start();
	}

}
