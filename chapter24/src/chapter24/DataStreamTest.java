/*
 * chapter 24-07. ������ ��Ʈ��
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
			
			// ������ ������ ������ ���� data.bin�� ����
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.bin")));
			out.writeDouble(3.14);	// �Ǽ��� ����
			out.writeInt(100);		// ������ ����
			out.writeUTF("�ڽ��� ������ �ٲ��� ���ϴ� ����� ���� ������ �ٲ� �� ����.");	// ���ڿ� ����
			
			out.flush();
			
			
			// data.bin ������ �о�ͼ� ���
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
