/*
 * chapter 23-05. 스레드 간의 조정
 * - 생산자-소비자 예제
 */

package chapter23;

// 케잌을 임시적으로 보관하는 클래스
// 해당 객체를 두 개의 스레드가 공유하게 된다.
class Buffer {
	private int data;	// 생산자 -> 소비자로 전해지는 데이터
	
	// true : 케잌이 없으니 소비자가 생산자를 기다림
	// false : 케잌이 있으니 생산자가 소비자를 기다림
	private boolean empty = true;
	
	// 케잌 소비
	public synchronized int get() {
		// 케잌이 생산되면 empty가 false로 변경
		while (empty) {
			try {
				wait();	// 케잌이 생산될 때 까지 기다림
			} catch (InterruptedException e) {
				
			}
		}
		
		empty = true;	// 케잌을 소비자가 가져갔으니 다시 빈 상태로 설정
		notifyAll();	// 생산자를 깨워서 케잌을 생산하게 함
		
		return data;
	}
	
	// 케잌 생산
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

// 생산자
// 케잌을 생산한 후에 난수 시간만큼 휴식을 취한다.
class Producer implements Runnable {
	private Buffer buffer;
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			buffer.put(i);	// buffer 객체에 완성된 케잌을 가져다 놓음
			
			System.out.println("생산자 : " + i + "번 케잌을 생산하였습니다.");
			
			try {
				Thread.sleep((int) (Math.random() * 100));	// 난수 시간만큼 휴식
			} catch (InterruptedException e) {
				
			}
		}
	}
}

// 소비자
class Consumer implements Runnable {
	private Buffer buffer;	// 버퍼 참조변수를 저장
	
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			int data = buffer.get();	// buffer 객체에 있는 케잌을 가져옴
			System.out.println("소비자 : " + i + "번 케잌을 소비하였습니다.");
			
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
