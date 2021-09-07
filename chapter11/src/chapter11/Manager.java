/*
 * chapter 11-04. ���� ������
 * - ���� ���(public member)		: ��� �ȴ�.
 * - ��ȣ ���(protected member)	: ��� �ȴ�.
 * - ��Ű�� ���(package member)	: ��� �ȴ�. ��� �ڽ� Ŭ���������� ���� ����
 * - ���� ���(private member)		: ��ӵ��� �ʴ´�.
 */

package chapter11;

public class Manager extends Employee {
	private int bonus;
	
	// protected -> public���� ���ü� ���� ����
	public int getSalary() {
		return salary + bonus;	// protected �ʵ��� salary�� �ڽ� Ŭ�������� ���� ����
	}
	
	// protected -> private�� ���ü� ���� �Ұ���
	/*
	private void setSalary(int salary) {
		super.salary = salary;
	}*/
	
	
	public void setRRN(int rrn) {
		// private �ʵ��� RRN�� �ڽ� Ŭ�������� ���� �Ұ���
		// RRN = rrn;
	}

}
