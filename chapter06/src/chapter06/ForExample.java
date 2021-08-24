/*
 * chapter 06-04.
 * For문 예제
 */

package chapter06;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for (초기식 ; 조건식 ; 증감식)
		// 초기식에서 변수를 생성할 경우 변수의 생존 범위는 반복문이 끝날때 까지다.
		for (int i = 0; i < 5; i++) {
			System.out.println("i의 값 : " + i);
		}
		
		// 이 이상 i를 사용할 경우 Error 발생
		//System.out.println(i);
	}

}
