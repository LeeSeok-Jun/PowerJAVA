/*
 * chapter 23-02. 스레드의 생성과 실행
 * - 2개의 스레드를 실행하기
 */

package chapter23;

class MyRunnable1 implements Runnable {
	String myName;
	
	public MyRunnable1(String name) {
		myName = name;
	}
	
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.print(myName + i + " ");
		}
	}
}

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyRunnable1("A"));
		Thread t2 = new Thread(new MyRunnable1("B"));
		
		t1.start();
		t2.start();
	}

}
