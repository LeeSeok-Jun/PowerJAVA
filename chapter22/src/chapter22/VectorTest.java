/*
 * chapter 22-05. �÷���
 * - Vector Ŭ���� : ���� ũ���� �迭
 */

package chapter22;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector vc = new Vector();	// ���� �迭 ����
		
		// ��� Ÿ���� ��ü�� ���ҷ� �߰� ����
		vc.add("Hello World!");
		vc.add(new Integer(10));
		vc.add(20);
		
		System.out.println("vector size : " + vc.size());
		
		for (int i = 0; i < vc.size(); i++) {
			System.out.println("vector element " + i + " : " + vc.get(i));
		}
		
		// 0�� �ε����� ���Ҹ� String���� �� ��ȯ
		String s = (String) vc.get(0);
		
		System.out.println(s instanceof String);
	}

}
