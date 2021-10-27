/*
 * chapter 22-11. Map
 */

package chapter22;

import java.util.*;

class Student {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Map 객체 생성 및 HashMap 사용
		// Map<Key, Value>로 이해하면 쉬울듯
		Map<String, Student> st = new HashMap<String, Student>();
		
		st.put("2009001", new Student(2009001, "구준표"));
		st.put("2009002", new Student(2009002, "금잔디"));
		st.put("2009003", new Student(2009003, "윤지후"));
		
		// 모든 항목 출력
		System.out.println(st);
		
		// 하나의 항목 삭제
		st.remove("2009002");
		
		// 항목 대치
		st.put("2009003", new Student(2009003, "소이정"));
		
		// 값을 참조
		System.out.println(st.get("2009003"));
		
		// 모든 항목 방문
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + " value = " + value);
		}
	}

}
