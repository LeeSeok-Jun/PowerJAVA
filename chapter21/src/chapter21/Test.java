/*
 * chapter 21-03. 예외와 메소드
 * - throws : 상위 메소드에게 명시한 예외를 처리하도록 맡긴다. 
 */

package chapter21;

import java.io.IOException;

public class Test {
	
	// main()은 readString()의 상위 메소드가 되어 여기서 예외를 처리한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// readString()에서 발생할 수 있는 예외를 여기서 처리
		try {
			System.out.println(readString());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	// 해당 메소드에서 IOException이 발생할 경우 상위 메소드로 전달
	public static String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오.");
		System.in.read(buf);
		return new String(buf);
	}

}
