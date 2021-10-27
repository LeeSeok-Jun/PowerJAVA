/* chapter 21-01. ���� ó����?
 * - finally : try - catch ���� ������ �ݵ�� ����Ǿ� �ڿ� �ݳ��� �����ϰ� ����.
 * - ���� ���� catch ����� �ִٸ� �ش�Ǵ� ���ܿ� �ش��ϴ� catch�� ����ȴ�.
 */

package chapter21;

import java.io.*;

public class FileError {
	private int[] list;
	private static final int SIZE = 10;
	
	public FileError() {
		list = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			list[i] = i;
		}
		
		writeList();
	}
	
	public void writeList() {
		PrintWriter out = null;
		
		try {
			out = new PrintWriter(new FileWriter("outfile.txt"));
			for (int i = 0; i <= SIZE; i++) {
				out.println("�迭 ���� : " + i + " = " + list[i]);
			}
		// �迭 �ε��� ���� �߻�
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Excetpion 1");
		// ����� ���� �߻�
		} catch (IOException e) {
			System.err.println("IOException");
		
		} finally {
			if (out != null) {
				out.close();	// �ڿ� �ݳ�
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileError();
	}

}
