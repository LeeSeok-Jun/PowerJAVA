/*
 * chapter 24-07. 데이터 스트림
 */
package chapter24;

import java.io.*;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			int c;
			
			// 다음의 내용을 데이터 파일 data.bin에 저장
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.bin")));
			out.writeDouble(3.14);	// 실수형 저장
			out.writeInt(100);		// 정수형 저장
			out.writeUTF("자신의 생각을 바꾸지 못하는 사람은 결코 현실을 바꿀 수 없다.");	// 문자열 저장
			
			out.flush();
			
			
			// data.bin 파일을 읽어와서 출력
			in = new DataInputStream(new BufferedInputStream(new FileInputStream("data.bin")));
			
			System.out.println(in.readDouble());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());
			
			
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
