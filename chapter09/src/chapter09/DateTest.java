/*
 * chapter 09-01. ������
 */

package chapter09;

import java.util.*;

class Date {
	private int year;
	private String month;
	private int day;
	
	// ����Ʈ ������
	public Date( ) {
		year = 2009;
		month = "1��";
		day = 1;
	}
	
	// ������
	public Date(int year, String month, int day) {
		setDate(year, month, day);
	}
	
	public Date(int year) {
		setDate(year, "1��", 1);
	}
	
	// ������
	public void setDate(int year, String month, int day) {
		this.year = year;		// this�� ���� ��ü�� ����Ų��.
		this.month = month;
		this.day = day;
	}
	
	public String toString() {
		return year + "�� " + month + " " + day + "��";
	}
}

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date(2009, "3��", 2);
		Date date2 = new Date(2019);
		Date date3 = new Date();
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}

}
