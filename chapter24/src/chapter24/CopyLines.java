/*
 * chapter 24-03. 문자 스트림
 * - InputStreamReader : 바이트 스트림 -> 문자 스트림
 * - OutputStreamWriter : 문자 스트림 -> 바이트 스트림
 * - 줄 단위의 입출력이 필요한 경우 BufferedReader와 PrintWriter로 클래스를 통해 효율적인 사용 가능.
 */

package chapter24;

import java.io.*;

public class CopyLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			// 효율성을 위하여 BufferedReader로 감싸는 것이 좋다.
			inputStream = new BufferedReader(new FileReader("input.txt"));
			outputStream = new PrintWriter(new FileWriter("output.txt"));
			
			// 해당 코드를 통해 한 줄 단위로 입출력 가능
			String l;
			while ((l = inputStream.readLine()) != null) {
				outputStream.println(l);
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
