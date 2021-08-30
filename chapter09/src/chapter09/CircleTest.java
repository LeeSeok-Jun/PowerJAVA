/*
 * chapter 09-01. »ý¼ºÀÚ
 */

package chapter09;

class Point {
	public int x;
	public int y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int a, int b) {
		x = a;
		y = b;
	}
	
	public String toString() {
		return "x : " + x + ", y : " + y;
	}
}

class Circle {
	public int radius = 0;
	public Point center;
	
	public Circle() {
		center = new Point(0, 0);
	}
	
	public Circle(int r) {
		center = new Point(0, 0);
		radius = r;
	}
	
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	
	public String toString() {
		return center.toString() + ", radius : " + radius;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
		
		System.out.println(p);
		System.out.println(c);
	}

}
