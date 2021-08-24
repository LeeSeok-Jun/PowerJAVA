/*
 * chapter 06-05.
 * continue문
 */

package chapter06;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "no news is good news";
		int n = 0;
		
		// 문자열 s에서 알파벳 'n'이 나오는 횟수 세기
		for (int i = 0; i < s.length(); i++) {
			// 문자열에서 i번째 문자가 n이 아닌 경우 다음 반복으로 넘어감
			if (s.charAt(i) != 'n') {
				continue;
			}
			
			// 문자열에서 n이 발견된 경우 변수의 값 증가
			n++;
		}
		
		System.out.println("문장에서 발견된 n의 개수 : " + n);
	}

}
