/*
 * chapter 11-04. 접근 지정자
 * - 공용 멤버(public member)		: 상속 된다.
 * - 보호 멤버(protected member)	: 상속 된다.
 * - 패키지 멤버(package member)	: 상속 된다. 대신 자식 클래스에서만 접근 가능
 * - 전용 멤버(private member)		: 상속되지 않는다.
 */

package chapter11;

public class Employee {
	public String name;
	private int RRN;
	protected int salary;
	
	protected int getSalary() {
		return salary;
	}
	
	protected void setSalary(int salary) {
		this.salary = salary;
	}

}
