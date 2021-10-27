/*
 * chapter 23-03. 스레드 활용
 * - interrupt()와 join()의 활용
 */

package chapter23;

public class ThreadControl {
	static void print(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s : %s%n", threadName, message);
	}
	
	// 내부 클래스 생성
	private static class MessageLoop implements Runnable {
		public void run() {
			String messages[] = {
					"Pride will have a fall.",
					"Power is dangerous unless you have humility.",
					"Office changes manners.",
					"Empty vessels make the most sound."
			};
			
			// 2초 간격으로 문자열 출력
			try {
				for (int i = 0; i < messages.length; i++) {
					print(messages[i]);
					Thread.sleep(2000);
				}
				
			// 인터럽트 발생 시 메세지 출력
			} catch (InterruptedException e) {
				print("아직 끝나지 않았어요!");
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int tries = 0;
		
		// 스레드는 main 스레드와 t 스레드 2개로 나뉜다.
		print("추가적인 스레드를 시작합니다.");
		Thread t = new Thread(new MessageLoop());
		// t 스레드 작업 시작
		t.start();
		
		print("추가적인 스레드가 끝나기를 기다립니다.");
		while (t.isAlive()) {
			print("아직 기다립니다.");
			// 스레드 t가 끝나기를 1초 동안 기다린다.
			t.join(1000);
			tries++;
			
			// 스레드 t를 강제로 종료시킨다.
			if (tries > 2) {
				print("참을 수 없어요!");
				t.interrupt();
				t.join();
			}
		}
		print("메인 스레드 종료!");
	}

}
