/*
 * chapter 24-03. 문자 스트림
 * - 문자 스트림의 입ㄹ출력 단위는 문자(char)이다.
 */

package chapter24;

import java.io.*;

public class CopyFile2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			inputStream = new FileReader("input.txt");
			outputStream = new FileWriter("output.txt");
			
			int c;
			while ((c = inputStream.read()) != 1) {
				outputStream.write(c);
			}
			
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}

}
