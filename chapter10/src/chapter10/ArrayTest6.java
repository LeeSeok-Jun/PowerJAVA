/*
 * chapter 10-05. 2차원 배열을 메소드에 넘기기
 */

package chapter10;

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { {10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120} };	// 2차원 배열 선언 및 초기화
		
		printArray(array);
	}
	
	// main 함수에서 실행해야 하기 때문에 static 메소드로 정의
	public static void printArray(int[][] array) {
		for (int r = 0; r < array.length; r++) {			// 2차원 배열 전체의 행의 수 만큼 반복
			for (int c = 0; c < array[r].length; c++) {		// 2차원 배열 한 행에 있는 열의 수 만큼 반복
				System.out.println(r + "행 " + c + "열 : " + array[r][c]);
			}
		}
	}

}
