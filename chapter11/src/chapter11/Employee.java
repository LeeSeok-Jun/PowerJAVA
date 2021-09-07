/*
 * chapter 11-04. ���� ������
 * - ���� ���(public member)		: ��� �ȴ�.
 * - ��ȣ ���(protected member)	: ��� �ȴ�.
 * - ��Ű�� ���(package member)	: ��� �ȴ�. ��� �ڽ� Ŭ���������� ���� ����
 * - ���� ���(private member)		: ��ӵ��� �ʴ´�.
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
