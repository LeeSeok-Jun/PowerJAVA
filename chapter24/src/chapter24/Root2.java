/*
 * chapter 24-05. 스캐닝과 포매팅
 */

package chapter24;

public class Root2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 8;
		double r = Math.log(i);
		
		System.out.format("log(" + "%d" + ")은 " + "%+020.10f" + "입니다. %n", i, r);
		// % -> 형식 지정ㅇ자의 시작
		// +0 -> 플래그	: 추가적인 포맷 옵션 +는 부호 비트, -는 오른쪽 정렬, 0은 0으로 채우기
		// 20 -> 폭		: 필드의 최소폭으로 필요한 경우 0으로 채워짐
		// .10 -> 정밀도	: 실수에 대해서 수학적인 정밀도
		// f -> 변환
	}

}
