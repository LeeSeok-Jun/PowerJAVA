/*
 * chapter 22-10. Queue
 * - 우선순위 큐 : remove() 호출 시 가장 작은 원소 추출
 * - heap으로 정렬되어 있는 상태
 * - 작업 스케쥴링에서 많이 사용
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
		
		System.out.println("원소 삭제");
		while (!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}

}
