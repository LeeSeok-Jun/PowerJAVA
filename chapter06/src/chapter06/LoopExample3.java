/*
 * chapter 06-03.
 * do-while 문
 */

package chapter06;

public class LoopExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
		// do 괄호 안의 문장은 최소 한 번 이상 실행된다!
		do {
			System.out.println("i의 값 : " + i);
			i++;
		}	while (i < 3);	// 세미콜론 사용함에 주의!
		
		return;
	}

}
