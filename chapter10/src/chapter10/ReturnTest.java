/*
 * chapter 10-03. �޼ҵ�� �迭
 * �޼ҵ��� ��ȯ������ �迭 ����
 */

package chapter10;

public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;
		array = getData();
		printData(array);
	}
	
	// ��ȯ���� int[]�� �迭
	private static int[] getData() {
		int[] tempData = {10, 20, 30, 40, 50};
		return tempData;
	}
	
	private static void printData(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}

}
