/*
 * chapter 22-09. Set
 * - 집합 연산 구현하기
 */

package chapter22;

import java.util.*;

public class SetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		
		s1.add("A");
		s1.add("B");
		s1.add("C");
		
		s2.add("A");
		s2.add("D");
		
		// 원본 집합을 보존하기 위해 복사본 생성
		Set<String> union = new HashSet<String>(s1);	// 합집합 저장 공간
		union.addAll(s2);	// s1과 s2의 합집합
		
		Set<String> intersection = new HashSet<String>(s1);	// 교집합 저장 공간
		intersection.retainAll(s2);	// s1과 s2의 교집합
		
		System.out.println("합집합 : " + union);
		System.out.println("교집합 : " + intersection);
	}

}
