/*
 * chapter 22-10. Queue
 * - �켱���� ť : remove() ȣ�� �� ���� ���� ���� ����
 * - heap���� ���ĵǾ� �ִ� ����
 * - �۾� �����층���� ���� ���
 */

package chapter22;

import java.util.*;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(30);
		pq.add(80);
		pq.add(20);
		
		for (Integer o : pq) {
			System.out.println(o);
		}
		
		System.out.println("���� ����");
		while (!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}

}