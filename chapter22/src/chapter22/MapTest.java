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
		
		// Map ��ü ���� �� HashMap ���
		// Map<Key, Value>�� �����ϸ� �����
		Map<String, Student> st = new HashMap<String, Student>();
		
		st.put("2009001", new Student(2009001, "����ǥ"));
		st.put("2009002", new Student(2009002, "���ܵ�"));
		st.put("2009003", new Student(2009003, "������"));
		
		// ��� �׸� ���
		System.out.println(st);
		
		// �ϳ��� �׸� ����
		st.remove("2009002");
		
		// �׸� ��ġ
		st.put("2009003", new Student(2009003, "������"));
		
		// ���� ����
		System.out.println(st.get("2009003"));
		
		// ��� �׸� �湮
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + " value = " + value);
		}
	}

}
