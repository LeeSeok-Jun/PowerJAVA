/*
 * chapter 10-06. 배열의 응용 : 정렬과 탐색
 * - 선택 정렬 : 입력 배열에서 최소값을 발견한 다음 이 최소값을 각 차례의 요소들과 교환하는 방법
 */

package chapter10;

import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {5, 3, 8, 1, 2, 7};
		
		selectionSort(list);
	}
	
	public static void selectionSort(int[] list) {
		int temp;		// 배열 내에서 교환을 위해 필요한 임시 저장공간
		int least;		// 배열 내의 현재 최솟값의 인덱스를 저장
		
		for (int i = 0; i < list.length; i++) {
			least = i;
			
			// 최솟값의 인덱스 탐색
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[least]) {
					least = j;
				}
			}
			
			// i번째 요소와 least 위치의 원소 교환
			temp = list[i];
			list[i] = list[least];
			list[least] = temp;
		}
		
		// Arrays.toString() : 배열의 원소 출력을 위한 라이브러리
		System.out.println(Arrays.toString(list));
	}

}
