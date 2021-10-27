/*
 * chapter 24-05. 스캐닝과 포매팅
 * - Scanner 클래스로 입력을 토큰으로 분리하기
 */

package chapter24;

import java.io.*;
import java.util.*;

public class ScanTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = null;
		
		try {
			// FileReader 객체를 인수로 갖는 BufferedReader를 다시 갖는 Scanner 객체 생성
			s = new Scanner(new BufferedReader(new FileReader("input.txt")));
			
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		} finally {
			if (s != null) {
				s.close();	// Scanner 객체에 연결된 스트림의 사용이 끝남을 알리기 위해 반드시 호출
			}
		}
	}

}
