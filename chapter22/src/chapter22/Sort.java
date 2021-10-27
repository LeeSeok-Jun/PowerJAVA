/*
 * chapter 22-12. Collections Ŭ����
 * - Collections�� ������ �պ� ������ ����Ѵ�.
 * - String�� Date���� Ŭ������ Comparable �������̽��� �����ϱ� ������ ���� ����
 */

package chapter22;

import java.util.*;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sample = {"i", "walk", "the", "line"};
		
		List<String> list = Arrays.asList(sample);	// �迭�� ����Ʈ�� ����
		
		Collections.sort(list);		// Collections Ŭ������ ���� �޼ҵ�� ����
		
		System.out.println(list);
	}

}
