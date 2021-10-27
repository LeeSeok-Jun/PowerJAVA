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
		
		// 문자열에 포함된 단어의 빈도를 계산
		for (String a : sample) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1: freq + 1);
		}
		
		System.out.println(m.size() + "단어가 있습니다.");
		
		System.out.println(m.containsKey("to"));	// Map에 특정 요소가 있는지 검사
		System.out.println(m.isEmpty());	// Map의 원소가 존재하는지 검사
		System.out.println(m);
	}

}
