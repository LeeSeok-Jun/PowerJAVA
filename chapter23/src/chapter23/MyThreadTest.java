/*
 * chapter 23-02. 스레드 생성과 실행
 * - Thread 클래스를 상속받아 구현하는 방법
 */

package chapter23;

class MyThread extends Thread {
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}
}

public class MyThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new MyThread();
		t.run();
	}

}
