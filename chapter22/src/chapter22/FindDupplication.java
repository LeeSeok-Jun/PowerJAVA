/*
 * chapter 22-09. Set
 * - ������ Ư¡�� �ߺ� �Ұ��� Ȱ���� �ߺ� �ܾ� ����
 */

package chapter22;

import java.util.*;

public class FindDupplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		
		String[] sample = {"�ܾ�", "�ߺ�", "����", "�ߺ�"};
		
		for (String a : sample) {
			if (!s.add(a)) {
				System.out.println("�ߺ��� �ܾ� : " + a);
			}
		}
		
		System.out.println("�ߺ����� ���� " + s.size() + " �ܾ� : " + s);
	}

}
