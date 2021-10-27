/*
 * chapter 22-07. ArrayList
 * - ArrayList : Ÿ�� �Ű������� ������ ���׸� Ŭ����
 * - ������ Ÿ���� �����͸� ������ �� �ִ� ���� ũ�� �迭
 */

package chapter22;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String Ÿ���� ��ü�� ������ �� �ִ� ArrayList ��ü ����
		ArrayList<String> list = new ArrayList<String>();
		
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
