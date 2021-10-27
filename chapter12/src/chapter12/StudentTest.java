/*
 * chapter 12-02. 인터페이스
 */

package chapter12;

import java.util.*;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		students[0] = new Student("홍길동", 3.39);
		students[1] = new Student("임꺽정", 4.21);
		students[2] = new Student("황진이", 2.19);
		
		// Arrays 클래스의 정적 메소드 sort()는 Comparable 인터페이스를 구현한 원소로 이룽어진 배열을 정렬한다.
		Arrays.sort(students);
		for (Student s : students) {
			System.out.println("이름 : " + s.getName() + " 성적 : " + s.getGpa());
		}
	}

}

class Student implements Comparable {
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getName( ) {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public int compareTo(Object obj) {
		Student other = (Student) obj;
		
		if (gpa > other.gpa) {
			return 1;
		}
		else if(gpa < other.gpa) {
			return -1;
		}
		else {
			return 0;
		}
	}
}