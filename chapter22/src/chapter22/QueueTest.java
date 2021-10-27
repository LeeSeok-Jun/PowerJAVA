/* 
 * chapter 22-10. Queue
 * - ī��Ʈ �ٿ� Ÿ�̸� ����
 * - �̸� ť�� �������� �־���� �̵� ���� ���ʴ�� ť���� �����Ǹ鼭 1�ʿ� �ϳ��� ȭ�鿡 ���
 */

package chapter22;

import java.util.*;

public class QueueTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int time = 10;
		
		// �����δ� LinkedList �ȿ� Queue �������̽��� �����Ǿ� �ִ�.
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = time; i >= 0 ; i--) {
			queue.add(i);
		}
		
		while (!queue.isEmpty()) {
			System.out.print(queue.remove() + " ");
			Thread.sleep(1000);	// ���� �����带 1�ʰ� ����.
			
		}
	}

}
