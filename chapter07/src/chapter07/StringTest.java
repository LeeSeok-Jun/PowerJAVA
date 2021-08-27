/*
 * chapter 07-06.
 * 문자열 객체의 생성과 사용
 */

package chapter07;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; // 기초 변수 : 기조 차로형을 가지는 변수로 실제 데이터 값이 저장된다.
		String s; // 참조 변수 : 객체를 참조할때 사용되는 변수로 객체의 주소가 들어 있다.
		
		String proverb = "A barking Dog";	// String 객체는 new 연산자를 생략하고 생성할 수 있다.
		String s1, s2, s3, s4;	// 참조 변수로서 메소드에서 반환된 참조값을 받는다.
		
		System.out.println("문자열의 길이 :" + proverb.length()); // 문자열 객체의 길이 반환 메소드 호출
		// String.length()는 정수형을 반환한다.
		// int size = "Hello".length()와 같은 문장 사용 가능
		
		s1 = proverb.concat(" never Bites!"); // s1에 proverb와 새로운 문자열을 연결한 결과를 저장
		s2 = proverb.replace('B', 'b'); 	// 문자 교환(B -> b)
		s3 = proverb.substring(2, 5); 		// 부분 문자열 추출 [2, 5) : 2~4번 인덱스의 문자열 추출
		s4 = proverb.toUpperCase(); 		// 대문자로 전환
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		return;
	}

}
