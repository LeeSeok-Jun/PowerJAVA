/*
 * chapter 22-07. ArrayList
 * - ArrayList : 타입 매개변수를 가지는 제네릭 클래스
 * - 동일한 타입의 데이터를 저장할 수 있는 가변 크기 배열
 */

package chapter22;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String 타입의 객체를 저장할 수 있는 ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		// {"MILK", "BREAD", "BUTTER"}
		
		list.add(1, "APPLE");
		list.set(2, "GRAPE");
		// {"MILK", "APPLE", "GRAPE", "BUTTER"}
		
		list.remove(3);
		// {"MILK", "APPLE", "GRAPE"}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
