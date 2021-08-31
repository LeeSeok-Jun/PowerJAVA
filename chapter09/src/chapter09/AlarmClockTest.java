/*
 * chapter 09-05. 클래스와 클래스 간의 관계
 * 집합(has-a) 관계 : 하나의 객체 안에 다른 객체들이 포함되는 관계
 * - 하나의 클래스(객체) 안에 다른 클래스(객체)들에 대한 참조를 포함하고 있다.
 */

package chapter09;

class Time {
	private int time;
	private int minute;
	private int second;
	
	public Time(int t, int m, int s) {
		time = t;
		minute = m;
		second = s;
	}
	
	public String toString() {
		return time + ":" + minute + ":" + second;
	}
}

class AlarmClock {
	// AlarmClock 클래스에서 Time 클래스 객체를 참조 변수로 사용
	private Time currentTime;
	private Time alarmTime;
	
	public AlarmClock(Time a, Time c) {
		alarmTime = a;
		currentTime = c;
	}
	
	public String toString() {
		return "current : " + currentTime + " alarm : " + alarmTime;
	}
}

public class AlarmClockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time alarm = new Time(6, 0, 0);
		Time current = new Time(12, 56, 34);
		
		AlarmClock c = new AlarmClock(alarm, current);
		
		System.out.print(c);
		
		return;
	}

}
