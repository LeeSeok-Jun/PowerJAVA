/* 
 * chapter 10-06. �迭�� ���� : ���İ� Ž��
 * - ���� Ž��(Binary Search) : ���ĵ� �迭���� ���ϴ� ���Ҹ� ������ Ž���ϴ� ���
 * - �ð� ���⵵ O(logN)
 */

package chapter10;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {10, 20, 30, 40, 50, 60, 70, 80};	// ���ĵ� �迭
		
		int retValue = binarySearch(data, 60);	// �ش� ������ �ε����� ��ȯ
		
		if (retValue != -1) {
			System.out.println("��ġ " + retValue + "���� �߰�");
		}
		else {
			System.out.println("�ش� �ϴ� ���Ұ� �����ϴ�.");
		}
		
	}
	
	public static int binarySearch(int[] list, int key) {
		int low, middle, high;
		
		low = 0;					// �� ù ��° ������ �ε���
		high = list.length - 1;		// �� ������ ������ �ε���
		
		while (low <= high) {
			middle = (low + high) / 2;
			
			if (key == list[middle]) {
				return middle;
			}
			else if (list[middle] < key) {
				low = middle;
			}
			else {
				high = middle;
			}
		}
		return -1;
	}

}
