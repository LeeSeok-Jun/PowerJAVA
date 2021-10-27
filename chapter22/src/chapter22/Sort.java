/*
 * chapter 22-12. Collections 클래스
 * - Collections의 정렬은 합병 정렬을 사용한다.
 * - String과 Date같은 클래스는 Comparable 인터페이스를 구현하기 때문에 정렬 가능
 */

package chapter22;

import java.util.*;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sample = {"i", "walk", "the", "line"};
		
		List<String> list = Arrays.asList(sample);	// 배열을 리스트로 변경
		
		Collections.sort(list);		// Collections 클래스의 정적 메소드로 정렬
		
		System.out.println(list);
	}

}
