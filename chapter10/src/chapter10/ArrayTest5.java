/*
 * chapter 10-05. 2차원 배열에서의 length 필드
 * - 일반적으로 2차원 배열에서 length필드는 행의 개수를 나타낸다.
 * - 각 행에 대해 length 필드를 적용 시켰을 때 각 행이 가지고 있는 열의 수를 나타낸다.
 */

package chapter10;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { {10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120} };	// 2차원 배열 선언 및 초기화
		
		for (int r = 0; r < array.length; r++) {			// 2차원 배열 전체의 행의 수 만큼 반복
			for (int c = 0; c < array[r].length; c++) {		// 2차원 배열 한 행에 있는 열의 수 만큼 반복
				System.out.println(r + "행 " + c + "열 : " + array[r][c]);
			}
		}
	}

}
