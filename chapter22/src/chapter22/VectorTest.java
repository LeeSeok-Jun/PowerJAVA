/*
 * chapter 22-05. 컬렉션
 * - Vector 클래스 : 가변 크기의 배열
 */

package chapter22;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector vc = new Vector();	// 가변 배열 생성
		
		// 모든 타입의 객체를 원소로 추가 가능
		vc.add("Hello World!");
		vc.add(new Integer(10));
		vc.add(20);
		
		System.out.println("vector size : " + vc.size());
		
		for (int i = 0; i < vc.size(); i++) {
			System.out.println("vector element " + i + " : " + vc.get(i));
		}
		
		// 0번 인덱스의 원소를 String으로 형 변환
		String s = (String) vc.get(0);
		
		System.out.println(s instanceof String);
	}

}
