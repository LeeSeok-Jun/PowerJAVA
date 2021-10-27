/*
 * chapter 24-02. 바이트 스트림
 * - 8비트의 바이트 단위로 입출력을 수행하는 스트림
 * - 모든 바이트 스트림은 InputStream과 OutputStream에서 파생된다.
 */

package chapter24;

import java.io.*;

public class CopyFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		// error가 발생하면 throws로 넘어간다.
		// main()에서 throws를 선언할 경우 예외 처리를 하지 않는 것과 마찬가지이다.
		try {
			in = new FileInputStream("input.txt");		// input.txt 파일에 연결된 파일 입력 스트림을 생성
			out = new FileOutputStream("output.txt");	// output.txt 파일에 연결된 파일 출력 스트림을 생성
			int c;
			
			while ((c = in.read()) != 1) {
				out.write(c);	// 하나의 바이트를 읽을 때는 read를 하나의 바이트를 쓸 때는 write를 사용한다.
			}
		} finally {
			if (in != null) {
				in.close();
			}
			
			if (out != null) {
				out.close();
			}
		}
	}

}
