/*
 * chapter 10-05. 2차원 배열
 */
package chapter10;

import java.util.*;

public class Rainfall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int YEARS = 3;
		final int QUARTERS = 4;
		
		double[][] rain = new double[YEARS][QUARTERS];	// 3행 4열 형태의 2차원 배열
		Scanner input = new Scanner(System.in);
		
		for (int y = 0; y < YEARS; y++) {
			for (int q = 0; q < QUARTERS; q++) {
				System.out.print(y + "차년도 " + q + "분기 강수량을 입력하시오 : ");
				rain[y][q] = input.nextDouble();
			}
		}
		
		for (int y = 0; y < YEARS; y++) {
			double total = 0;	// 반복문 안에서 선언된 변수는 반복문이 끝나면 수명이 끝난다.
			
			for (int q = 0; q < QUARTERS; q++) {
				total += rain[y][q];
			}
			
			System.out.println(y + "차년도 강수량은 " + total);
		}
		
		input.close();	// 객체 소멸
	
	}

}
