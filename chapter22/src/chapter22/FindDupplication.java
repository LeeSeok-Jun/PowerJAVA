/*
 * chapter 22-09. Set
 * - 집합의 특징인 중복 불가를 활용한 중복 단어 검출
 */

package chapter22;

import java.util.*;

public class FindDupplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>();
		
		String[] sample = {"단어", "중복", "구절", "중복"};
		
		for (String a : sample) {
			if (!s.add(a)) {
				System.out.println("중복된 단어 : " + a);
			}
		}
		
		System.out.println("중복되지 않은 " + s.size() + " 단어 : " + s);
	}

}
