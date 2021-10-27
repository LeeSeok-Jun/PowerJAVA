/*
 * chapter 22-12. Collections Ŭ����
 * - ����ڰ� ������ Ŭ������ �����ϴ� ���
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
	
	// Collections.sort()�� ����ϱ� ���� Comparable �������̽��� compareTo �޼ҵ� ����
	public int compareTo(Student1 s) {
		return number - s.number;
	}
}

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 array[] = {
				new Student1(2009001, "��ö��"),
				new Student1(2009002, "��ö��"),
				new Student1(2009003, "��ö��")
		};
		
		List<Student1> list = Arrays.asList(array);
		Collections.sort(list);		// ��������
		// Collections.sort(list, Collections.reverseOrder())	// ��������
		
		System.out.println(list);
	}

}
