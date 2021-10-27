/*
 * chapter 23-02. ������ ������ ����
 * - Runnable �������̽��� ��ӹ޾� �����ϴ� ���
 */

package chapter23;

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}
}

public class MyRunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Thread�� ��ӹ޾� �����ϴ� ����� �ٸ��� ����
		Thread t = new Thread(new MyRunnable());
		t.start();

	}

}
