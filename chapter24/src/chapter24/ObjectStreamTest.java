/*
 * chapter 24-08. 객체 입출력
 */

package chapter24;

import java.io.*;
import java.util.Date;

public class ObjectStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			// Date 객체를 object.dat 파일에 기록
			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			out.writeObject(new Date());
			
			out.flush();	// 버퍼 삭제
			
			// object.dat 파일에서 객체 정보를 읽어옴
			in = new ObjectInputStream(new FileInputStream("object.dat"));
			Date d = (Date) in.readObject();
			
			System.out.println(d);
		} catch (ClassNotFoundException e) {
			
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
