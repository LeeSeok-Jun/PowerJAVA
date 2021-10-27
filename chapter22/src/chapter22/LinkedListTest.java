/*
 * chapter 22-08. LinkedList
 * - LinkedList : 이중 연결 리스트
 * - 자료를 추가하고 삭제하는데 ArrayList보다 편리하다.
 * - 탐색 시 맨 처음 원소부터 탐색하므로 인덱싱이 느리다.
 */

package chapter22;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		// {"MILK", "BREAD", "BUTTER"}
		
		list.add(1, "APPLE");
		list.set(2, "GRAPE");
		// {"MILK", "APPLE", "GRAPE", "BUTTER"}
		
		list.remove(3);
		// {"MILK", "APPLE", "GRAPE"}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		
		}
	}
}
