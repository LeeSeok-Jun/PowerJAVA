/*
 * chapter 24-05. ��ĳ�װ� ������
 */

package chapter24;

public class Root2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 8;
		double r = Math.log(i);
		
		System.out.format("log(" + "%d" + ")�� " + "%+020.10f" + "�Դϴ�. %n", i, r);
		// % -> ���� ���������� ����
		// +0 -> �÷���	: �߰����� ���� �ɼ� +�� ��ȣ ��Ʈ, -�� ������ ����, 0�� 0���� ä���
		// 20 -> ��		: �ʵ��� �ּ������� �ʿ��� ��� 0���� ä����
		// .10 -> ���е�	: �Ǽ��� ���ؼ� �������� ���е�
		// f -> ��ȯ
	}

}
