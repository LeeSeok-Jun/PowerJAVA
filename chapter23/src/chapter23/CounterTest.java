/*
 * chapter 23-04. 동기화
 * - 스레드 간섭 실험
 */

package chapter23;

class Counter {
	private int value = 0;
	
	/*
	public void increment() {
		value++;
	}
	
	public void decrement() {
		value--;
	}
	
	public void printCounter() {
		System.out.println(value);
	}
	*/
	
	// 동기화된 메소드 사용
	// 반환형 앞에 synchronized 붙인다.
	public synchronized void increment() {
		value++;
	}
	
	public synchronized void decrement() {
		value--;
	}
	
	public synchronized void printCounter() {
		System.out.println(value);
	}
}

class MyThread1 extends Thread {
	Counter sharedCounter;
	
	public MyThread1(Counter c) {
		this.sharedCounter = c;
	}
	
	public void run() {
		int i = 0;
		
		while (i < 20000) {
			sharedCounter.increment();
			sharedCounter.decrement();
			
			if (i % 40 == 0) {
				sharedCounter.printCounter();
			}
			
			try {
				sleep((int) (Math.random() * 2));
			} catch (InterruptedException e) {
				
			}
			
			i++;
		}
	}
}

public class CounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		
		// 4개의 스레드 생성 후 실행
		new MyThread1(c).start();
		new MyThread1(c).start();
		new MyThread1(c).start();
		new MyThread1(c).start();
	}

}
