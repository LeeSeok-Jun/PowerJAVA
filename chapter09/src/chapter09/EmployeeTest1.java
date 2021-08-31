/*
 * chapter 09-03. ���� ����
 */

package chapter09;

import java.util.*;

class Employee1 {
	private String name;		// ���� ��� : Ŭ���� ���ο����� ���� ���
	private int salary;			// ���� ���
	int age;					// ��Ű�� ��� : ���� ��Ű�� �ȿ� ��� Ŭ������ ���� ����
	
	// ������
	public Employee1(String n, int a, int s) {
		name = n;
		age = a;
		salary = s;
	}
	
	// name ������
	// ���� ��� : �ٸ� ��� Ŭ�������� ��� ����
	public String getName() {
		return name;
	}
	
	// salary ������
	// ���� ���
	public int getSalary() {
		return salary;
	}
	
	// age ������
	// ��Ű�� ���
	int getAge() {
		return age;
	}
}	

public class EmployeeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e;
		e = new Employee1("ȫ�浿", 0, 3000);
		
		// error : private ������ ���� ����
		// e.salary = 300;
		
		// ���� ��Ű�� �ȿ� �����Ƿ� ���� ����
		e.age = 26;		// age : 0 -> 26
		
		// error : private �޼ҵ� ���� ȣ��
		// int sa = e.getSalary();
		
		String s = e.getName();
		System.out.println(s);
		
		int a = e.getAge();
		System.out.println(a);	
		
		return;
	}

}
