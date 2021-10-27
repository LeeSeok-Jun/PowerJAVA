/*
 * chapter 24-02. ����Ʈ ��Ʈ��
 * - 8��Ʈ�� ����Ʈ ������ ������� �����ϴ� ��Ʈ��
 * - ��� ����Ʈ ��Ʈ���� InputStream�� OutputStream���� �Ļ��ȴ�.
 */

package chapter24;

import java.io.*;

public class CopyFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		// error�� �߻��ϸ� throws�� �Ѿ��.
		// main()���� throws�� ������ ��� ���� ó���� ���� �ʴ� �Ͱ� ���������̴�.
		try {
			in = new FileInputStream("input.txt");		// input.txt ���Ͽ� ����� ���� �Է� ��Ʈ���� ����
			out = new FileOutputStream("output.txt");	// output.txt ���Ͽ� ����� ���� ��� ��Ʈ���� ����
			int c;
			
			while ((c = in.read()) != 1) {
				out.write(c);	// �ϳ��� ����Ʈ�� ���� ���� read�� �ϳ��� ����Ʈ�� �� ���� write�� ����Ѵ�.
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
