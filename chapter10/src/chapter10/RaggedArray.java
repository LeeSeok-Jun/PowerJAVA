/* 
 * chapter 10-05. ����� �迭
 * - �� �ึ�� ���� ũ�⸦ �ٸ��� �ϴ� �迭 ����
 */

package chapter10;

public class RaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] raggedArray = new int[3][];
		
		raggedArray[0] = new int[3];	// 0���� ���� ���� 3
		raggedArray[1] = new int[4];	// 1���� ���� ���� 4
		raggedArray[2] = new int[5];	// 2���� ���� ���� 5
		
		for (int i = 0; i < raggedArray.length; i++) {
			System.out.println(i + "���� ���̴� " + raggedArray[i].length + "�Դϴ�.");
		}
	}

}
