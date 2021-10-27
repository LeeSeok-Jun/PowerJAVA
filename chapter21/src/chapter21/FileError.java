/* chapter 21-01. 예외 처리란?
 * - finally : try - catch 문이 끝나면 반드시 실행되어 자원 반납에 용이하게 쓰임.
 * - 여러 개의 catch 블록이 있다면 해당되는 예외에 해당하는 catch만 실행된다.
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
				out.println("배열 원소 : " + i + " = " + list[i]);
			}
		// 배열 인덱스 오류 발생
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Excetpion 1");
		// 입출력 오류 발생
		} catch (IOException e) {
			System.err.println("IOException");
		
		} finally {
			if (out != null) {
				out.close();	// 자원 반납
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileError();
	}

}
