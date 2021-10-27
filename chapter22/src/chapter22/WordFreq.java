/*
 * chapter 22-11. Map
 */

package chapter22;

import java.util.*;

public class WordFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "problem"};
		
		// ���ڿ��� ���Ե� �ܾ��� �󵵸� ���
		for (String a : sample) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1: freq + 1);
		}
		
		System.out.println(m.size() + "�ܾ �ֽ��ϴ�.");
		
		System.out.println(m.containsKey("to"));	// Map�� Ư�� ��Ұ� �ִ��� �˻�
		System.out.println(m.isEmpty());	// Map�� ���Ұ� �����ϴ��� �˻�
		System.out.println(m);
	}

}
