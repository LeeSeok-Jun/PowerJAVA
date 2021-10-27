/* 
 * chapter 22-10. Queue
 * - 카운트 다운 타이머 구현
 * - 미리 큐에 정수들을 넣어놓고 이들 값이 차례대로 큐에서 삭제되면서 1초에 하나씩 화면에 출력
 */

package chapter22;

import java.util.*;

public class QueueTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int time = 10;
		
		// 실제로는 LinkedList 안에 Queue 인터페이스가 구현되어 있다.
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = time; i >= 0 ; i--) {
			queue.add(i);
		}
		
		while (!queue.isEmpty()) {
			System.out.print(queue.remove() + " ");
			Thread.sleep(1000);	// 현재 스레드를 1초간 재운다.
			
		}
	}

}
