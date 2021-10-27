/*
 * chapter 12-02. �������̽�
 */

package chapter12;

import java.util.*;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		students[0] = new Student("ȫ�浿", 3.39);
		students[1] = new Student("�Ӳ���", 4.21);
		students[2] = new Student("Ȳ����", 2.19);
		
		// Arrays Ŭ������ ���� �޼ҵ� sort()�� Comparable �������̽��� ������ ���ҷ� �̷���� �迭�� �����Ѵ�.
		Arrays.sort(students);
		for (Student s : students) {
			System.out.println("�̸� : " + s.getName() + " ���� : " + s.getGpa());
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