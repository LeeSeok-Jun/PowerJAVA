/*
 * chapter 24-03. ���� ��Ʈ��
 * - InputStreamReader : ����Ʈ ��Ʈ�� -> ���� ��Ʈ��
 * - OutputStreamWriter : ���� ��Ʈ�� -> ����Ʈ ��Ʈ��
 * - �� ������ ������� �ʿ��� ��� BufferedReader�� PrintWriter�� Ŭ������ ���� ȿ������ ��� ����.
 */

package chapter24;

import java.io.*;

public class CopyLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			// ȿ������ ���Ͽ� BufferedReader�� ���δ� ���� ����.
			inputStream = new BufferedReader(new FileReader("input.txt"));
			outputStream = new PrintWriter(new FileWriter("output.txt"));
			
			// �ش� �ڵ带 ���� �� �� ������ ����� ����
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
