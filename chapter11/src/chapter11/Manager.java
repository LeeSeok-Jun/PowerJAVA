/*
 * chapter 11-04. 접근 지정자
 * - 공용 멤버(public member)		: 상속 된다.
 * - 보호 멤버(protected member)	: 상속 된다.
 * - 패키지 멤버(package member)	: 상속 된다. 대신 자식 클래스에서만 접근 가능
 * - 전용 멤버(private member)		: 상속되지 않는다.
 */

package chapter11;

public class Manager extends Employee {
	private int bonus;
	
	// protected -> public으로 가시성 증가 가능
	public int getSalary() {
		return salary + bonus;	// protected 필드인 salary는 자식 클래스에서 접근 가능
	}
	
	// protected -> private로 가시성 감소 불가능
	/*
	private void setSalary(int salary) {
		super.salary = salary;
	}*/
	
	
	public void setRRN(int rrn) {
		// private 필드인 RRN은 자식 클래스에서 접근 불가능
		// RRN = rrn;
	}

}
