/*
 * chapter 04-03.
 */

package chapter04;

// 입력 역할을 수행하는 패키지 포함하기
// 자바 클래스 라이브러리 호출
import java.util.Scanner; // Scanner 클래스를 포함

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // input이라는 이름의 Scanner 객체 생성
		
		// 변수 선언
		int x;
		int y;
		int sum;
		
		// 첫 번째 숫자 입력
		System.out.print("첫 번째 숫자를 입력하시오. : ");
		x = input.nextInt(); // input 객체의 메소드인 nextInt()로 정수형 값을 입력 받을 수 있다.
		
		// 두 번째 숫자 입력
		System.out.print("두 번째 숫자를 입력하시오. : ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println(sum);
		
		return;
	}

}
