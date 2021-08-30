/*
 * chapter 09-01. 생성자
 */

package chapter09;

import java.util.*;

class Date {
	private int year;
	private String month;
	private int day;
	
	// 디폴트 생성자
	public Date( ) {
		year = 2009;
		month = "1월";
		day = 1;
	}
	
	// 생성자
	public Date(int year, String month, int day) {
		setDate(year, month, day);
	}
	
	public Date(int year) {
		setDate(year, "1월", 1);
	}
	
	// 설정자
	public void setDate(int year, String month, int day) {
		this.year = year;		// this는 현재 객체를 가리킨다.
		this.month = month;
		this.day = day;
	}
	
	public String toString() {
		return year + "년 " + month + " " + day + "일";
	}
}

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date(2009, "3월", 2);
		Date date2 = new Date(2019);
		Date date3 = new Date();
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}

}
