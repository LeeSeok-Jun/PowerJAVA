/*
 * chapter 10-02. �迭�� ��뿹
 */

package chapter10;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*1000);		// 0~999 ���� ������ �� ����
		}
		
		// for-each(�ڷ��� ���� : �迭)
		// Python�� for ���� in �迭 �����ϸ� �����ϱ� ����
		for (int value : numbers) {
			System.out.println(value);
		}
	}

}
