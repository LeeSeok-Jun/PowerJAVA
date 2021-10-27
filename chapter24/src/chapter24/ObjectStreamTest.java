/*
 * chapter 24-08. ��ü �����
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
			// Date ��ü�� object.dat ���Ͽ� ���
			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			out.writeObject(new Date());
			
			out.flush();	// ���� ����
			
			// object.dat ���Ͽ��� ��ü ������ �о��
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
