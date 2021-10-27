/*
 * chapter 23-02. 스레드 생성과 실행
 * - Runnable 인터페이스를 상속받아 실행하는 방법
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
		// Thread를 상속받아 실행하는 방법과 다름에 유의
		Thread t = new Thread(new MyRunnable());
		t.start();

	}

}
