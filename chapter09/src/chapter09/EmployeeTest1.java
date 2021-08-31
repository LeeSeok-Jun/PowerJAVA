/*
 * chapter 09-03. 접근 제어
 */

package chapter09;

import java.util.*;

class Employee1 {
	private String name;		// 전용 멤버 : 클래스 내부에서만 접근 허용
	private int salary;			// 전용 멤버
	int age;					// 패키지 멤버 : 같은 패키지 안에 모든 클래스가 접근 가능
	
	// 생성자
	public Employee1(String n, int a, int s) {
		name = n;
		age = a;
		salary = s;
	}
	
	// name 접근자
	// 공용 멤버 : 다른 모든 클래스들이 사용 가능
	public String getName() {
		return name;
	}
	
	// salary 접근자
	// 전용 멤버
	public int getSalary() {
		return salary;
	}
	
	// age 접근자
	// 패키지 멤버
	int getAge() {
		return age;
	}
}	

public class EmployeeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e;
		e = new Employee1("홍길동", 0, 3000);
		
		// error : private 변수에 직접 접근
		// e.salary = 300;
		
		// 같은 패키지 안에 있으므로 접근 가능
		e.age = 26;		// age : 0 -> 26
		
		// error : private 메소드 직접 호출
		// int sa = e.getSalary();
		
		String s = e.getName();
		System.out.println(s);
		
		int a = e.getAge();
		System.out.println(a);	
		
		return;
	}

}
