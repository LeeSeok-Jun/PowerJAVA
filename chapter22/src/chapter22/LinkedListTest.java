/*
 * chapter 22-08. LinkedList
 * - LinkedList : ���� ���� ����Ʈ
 * - �ڷḦ �߰��ϰ� �����ϴµ� ArrayList���� ���ϴ�.
 * - Ž�� �� �� ó�� ���Һ��� Ž���ϹǷ� �ε����� ������.
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
