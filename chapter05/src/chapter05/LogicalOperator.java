/*
 * chapter 05-04.
 */

package chapter05;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 4;
		
		// ��������
		System.out.println((x == 3) && (y == 7)); // true && false => false
		System.out.println((x == 3) || (y == 4)); // true || true => true
		
		// &&�� ||�������� ��� �ܶ� ������ �����ؾ� �Ѵ�.
		// a && b ���꿡�� a == false�� ��� �����Ϸ��� b�� ������� �ʴ´�.
		// ���� b == 1/0 �� ���� ��Ȳ������ ������ �߻����� �ʴ´�.
		System.out.println(false && (1 == 1/0));	// ���� �߻� ����
		
		
		// ���ǿ�����(���׿�����)
		int max_value = (x > y)? x : y;
		System.out.println(max_value);
		return;
	}

}
