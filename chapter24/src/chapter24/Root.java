/*
 * chapter 24-05. 스캐닝과 포매팅
 * - 형식 제어 문자열에 기초하여 다수의 인수를 포맷한다.
 * - format() 메소드는 값을 세밀하게 제어할 수 있다.
 */

package chapter24;

public class Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 8;
		double r = Math.log(i);
		
		System.out.format("log(" + "%d" + ")은 " + "%f" + "입니다. %n", i, r);
		// java에서는 \n은 항상 라인피트 문자 (\\u000A) 만을 생성한다.
		// 정확한 줄바꿈을 위해서는 %n을 사용하는 것이 바람직하다.
	}

}
