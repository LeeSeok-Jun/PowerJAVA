/*
 * chapter 22-12. Collections 클래스
 * - 사용자가 정의한 클래스를 정렬하는 방법
 */

package chapter22;

import java.util.*;

class Student1 implements Comparable<Student1> {
	int number;
	String name;
	
	public Student1(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	// Collections.sort()를 사용하기 위해 Comparable 인터페이스의 compareTo 메소드 구현
	public int compareTo(Student1 s) {
		return number - s.number;
	}
}

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 array[] = {
				new Student1(2009001, "김철수"),
				new Student1(2009002, "이철수"),
				new Student1(2009003, "박철수")
		};
		
		List<Student1> list = Arrays.asList(array);
		Collections.sort(list);		// 오름차순
		// Collections.sort(list, Collections.reverseOrder())	// 내림차순
		
		System.out.println(list);
	}

}
