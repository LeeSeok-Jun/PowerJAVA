/*
 * chapter 05-04.
 */

package chapter05;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 4;
		
		// 논리연산자
		System.out.println((x == 3) && (y == 7)); // true && false => false
		System.out.println((x == 3) || (y == 4)); // true || true => true
		
		// &&와 ||연산자의 경우 단락 연산을 주의해야 한다.
		// a && b 연산에서 a == false인 경우 컴파일러는 b를 계산하지 않는다.
		// 따라서 b == 1/0 과 같은 상황에서도 오류가 발생하지 않는다.
		System.out.println(false && (1 == 1/0));	// 오류 발생 안함
		
		
		// 조건연산자(삼항연산자)
		int max_value = (x > y)? x : y;
		System.out.println(max_value);
		return;
	}

}
