/*
 * chapter 06-05.
 * continue��
 */

package chapter06;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "no news is good news";
		int n = 0;
		
		// ���ڿ� s���� ���ĺ� 'n'�� ������ Ƚ�� ����
		for (int i = 0; i < s.length(); i++) {
			// ���ڿ����� i��° ���ڰ� n�� �ƴ� ��� ���� �ݺ����� �Ѿ
			if (s.charAt(i) != 'n') {
				continue;
			}
			
			// ���ڿ����� n�� �߰ߵ� ��� ������ �� ����
			n++;
		}
		
		System.out.println("���忡�� �߰ߵ� n�� ���� : " + n);
	}

}
