/*
 * chapter 07-06.
 * ���ڿ� ��ü�� ������ ���
 */

package chapter07;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; // ���� ���� : ���� �������� ������ ������ ���� ������ ���� ����ȴ�.
		String s; // ���� ���� : ��ü�� �����Ҷ� ���Ǵ� ������ ��ü�� �ּҰ� ��� �ִ�.
		
		String proverb = "A barking Dog";	// String ��ü�� new �����ڸ� �����ϰ� ������ �� �ִ�.
		String s1, s2, s3, s4;	// ���� �����μ� �޼ҵ忡�� ��ȯ�� �������� �޴´�.
		
		System.out.println("���ڿ��� ���� :" + proverb.length()); // ���ڿ� ��ü�� ���� ��ȯ �޼ҵ� ȣ��
		// String.length()�� �������� ��ȯ�Ѵ�.
		// int size = "Hello".length()�� ���� ���� ��� ����
		
		s1 = proverb.concat(" never Bites!"); // s1�� proverb�� ���ο� ���ڿ��� ������ ����� ����
		s2 = proverb.replace('B', 'b'); 	// ���� ��ȯ(B -> b)
		s3 = proverb.substring(2, 5); 		// �κ� ���ڿ� ���� [2, 5) : 2~4�� �ε����� ���ڿ� ����
		s4 = proverb.toUpperCase(); 		// �빮�ڷ� ��ȯ
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		return;
	}

}
