/* 
 * chapter 10-06. 배열의 응용 : 정렬과 탐색
 * - 이진 탐색(Binary Search) : 정렬된 배열에서 원하는 원소를 빠르게 탐색하는 기법
 * - 시간 복잡도 O(logN)
 */

package chapter10;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {10, 20, 30, 40, 50, 60, 70, 80};	// 정렬된 배열
		
		int retValue = binarySearch(data, 60);	// 해당 원소의 인덱스를 반환
		
		if (retValue != -1) {
			System.out.println("위치 " + retValue + "에서 발견");
		}
		else {
			System.out.println("해당 하는 원소가 없습니다.");
		}
		
	}
	
	public static int binarySearch(int[] list, int key) {
		int low, middle, high;
		
		low = 0;					// 맨 첫 번째 원소의 인덱스
		high = list.length - 1;		// 맨 마지막 원소의 인덱스
		
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
