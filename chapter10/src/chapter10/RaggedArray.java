/* 
 * chapter 10-05. 톱니형 배열
 * - 각 행마다 열의 크기를 다르게 하는 배열 선언
 */

package chapter10;

public class RaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] raggedArray = new int[3][];
		
		raggedArray[0] = new int[3];	// 0행의 열의 수는 3
		raggedArray[1] = new int[4];	// 1행의 열의 수는 4
		raggedArray[2] = new int[5];	// 2행의 열의 수는 5
		
		for (int i = 0; i < raggedArray.length; i++) {
			System.out.println(i + "행의 길이는 " + raggedArray[i].length + "입니다.");
		}
	}

}
