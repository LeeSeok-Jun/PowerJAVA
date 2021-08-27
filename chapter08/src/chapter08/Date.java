/*
 * chapter 08-04. 필드 선언
 */

package chapter08;

public class Date {
	// 접근 수식자
	// public : 이 수식자는 모든 클래스로부터 접근가능하다.
	// private : 이 수식자는 클래스 내부에서만 접근이 가능하다.
	
	public void printDate() {
		System.out.println(year + "." + month + "." + day);
	}
	
	public int detDay() {
		return day;
	}
	
	// 필드의 선언 위치는 클래스 내부의 어디든 상관 없다.
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
