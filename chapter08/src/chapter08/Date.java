/*
 * chapter 08-04. �ʵ� ����
 */

package chapter08;

public class Date {
	// ���� ������
	// public : �� �����ڴ� ��� Ŭ�����κ��� ���ٰ����ϴ�.
	// private : �� �����ڴ� Ŭ���� ���ο����� ������ �����ϴ�.
	
	public void printDate() {
		System.out.println(year + "." + month + "." + day);
	}
	
	public int detDay() {
		return day;
	}
	
	// �ʵ��� ���� ��ġ�� Ŭ���� ������ ���� ��� ����.
	public int year;
	public String month;
	public int day;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date myDate = new Date();
		
		myDate.year = 2021;
		myDate.month = "08";
		myDate.day = 27;
		
		myDate.printDate();
	}

}
