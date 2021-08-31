/*
 * chapter 09-05. Ŭ������ Ŭ���� ���� ����
 * ����(has-a) ���� : �ϳ��� ��ü �ȿ� �ٸ� ��ü���� ���ԵǴ� ����
 * - �ϳ��� Ŭ����(��ü) �ȿ� �ٸ� Ŭ����(��ü)�鿡 ���� ������ �����ϰ� �ִ�.
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
	// AlarmClock Ŭ�������� Time Ŭ���� ��ü�� ���� ������ ���
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
