/*
 * chapter 24-03. ���� ��Ʈ��
 * - ���� ��Ʈ���� �Ԥ���� ������ ����(char)�̴�.
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
