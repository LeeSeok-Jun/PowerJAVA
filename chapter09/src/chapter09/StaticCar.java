/*
 * chapter 09-02. ���� ������ ���� �޼ҵ�
 * ���� ����(static variable) : �ϳ��� Ŭ������ �ϳ��� �����ϸ� �� Ŭ������ ��� ��ü�鿡 ���� �����Ǵ� ����
 */

package chapter09;

public class StaticCar {
	private int speed;
	private int mileage;
	private String color;
	
	private int id;			// �ڵ��� �ø��� ��ȣ
	
	// ���� ����
	// �ڵ����� ��(��ü�� ��)�� ��ü ��ü�� ����
	private static int numberOfCars	= 0;
	
	// ������
	public StaticCar(int s, int m, String c) {
		speed = s;
		mileage = m;
		color = c;
		
		// �ڵ��� �ø��� ��ȣ�� ���ݱ��� ������ �������� ���� + 1
		id = ++numberOfCars;
	}
	
	public String toString() {
		return speed + " " + mileage + " " + color + " " + id;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticCar sc1 = new StaticCar(100, 50000, "black");
		StaticCar sc2 = new StaticCar(90, 40000, "white");
		StaticCar sc3 = new StaticCar(80, 30000, "gray");
		
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc3);
	}

}
