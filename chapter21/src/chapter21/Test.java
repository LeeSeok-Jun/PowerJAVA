/*
 * chapter 21-03. ���ܿ� �޼ҵ�
 * - throws : ���� �޼ҵ忡�� ����� ���ܸ� ó���ϵ��� �ñ��. 
 */

package chapter21;

import java.io.IOException;

public class Test {
	
	// main()�� readString()�� ���� �޼ҵ尡 �Ǿ� ���⼭ ���ܸ� ó���Ѵ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// readString()���� �߻��� �� �ִ� ���ܸ� ���⼭ ó��
		try {
			System.out.println(readString());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	// �ش� �޼ҵ忡�� IOException�� �߻��� ��� ���� �޼ҵ�� ����
	public static String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		System.in.read(buf);
		return new String(buf);
	}

}
