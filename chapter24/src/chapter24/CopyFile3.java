/* chapter 24-05. ��ĳ�װ� ������
 */

package chapter24;

import java.io.*; 

public class CopyFile3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		PrintWriter out = null;
		
		// output.txt ���Ͽ� �Ʒ� ������ �� �پ� �ۼ�
		out = new PrintWriter(new FileWriter("output.txt"));
		out.println("��ȭ�� ���Ѵٸ�,");
		out.println("���� ���� �ڽ��� ��ȭ�� �� �ִٴ� �Ͱ�");
		out.println("��ȭ�ϱ���� �������� �ʰ�");
		out.println("����ؼ� ����� �� �ִٴ� ���� �Ͼ�� �Ѵ�.");
		out.flush(); 	// ���� ����
		
		// output.txt ���Ͽ� �ִ� ������ �� �پ� �о ���
		in = new BufferedReader(new FileReader("output.txt"));
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}
		
		if (in != null) {
			in.close();
		}
		if (out != null) {
			out.close();
		}
	}

}
