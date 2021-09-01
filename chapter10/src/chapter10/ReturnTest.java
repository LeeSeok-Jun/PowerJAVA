/*
 * chapter 10-03. 메소드와 배열
 * 메소드의 반환값으로 배열 전달
 */

package chapter10;

public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;
		array = getData();
		printData(array);
	}
	
	// 반환값이 int[]로 배열
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
