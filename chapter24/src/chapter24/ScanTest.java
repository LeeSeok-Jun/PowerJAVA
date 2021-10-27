/*
 * chapter 24-05. ��ĳ�װ� ������
 * - Scanner Ŭ������ �Է��� ��ū���� �и��ϱ�
 */

package chapter24;

import java.io.*;
import java.util.*;

public class ScanTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = null;
		
		try {
			// FileReader ��ü�� �μ��� ���� BufferedReader�� �ٽ� ���� Scanner ��ü ����
			s = new Scanner(new BufferedReader(new FileReader("input.txt")));
			
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		} finally {
			if (s != null) {
				s.close();	// Scanner ��ü�� ����� ��Ʈ���� ����� ������ �˸��� ���� �ݵ�� ȣ��
			}
		}
	}

}
