/*
 * chapter 04-03.
 */

package chapter04;

// �Է� ������ �����ϴ� ��Ű�� �����ϱ�
// �ڹ� Ŭ���� ���̺귯�� ȣ��
import java.util.Scanner; // Scanner Ŭ������ ����

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // input�̶�� �̸��� Scanner ��ü ����
		
		// ���� ����
		int x;
		int y;
		int sum;
		
		// ù ��° ���� �Է�
		System.out.print("ù ��° ���ڸ� �Է��Ͻÿ�. : ");
		x = input.nextInt(); // input ��ü�� �޼ҵ��� nextInt()�� ������ ���� �Է� ���� �� �ִ�.
		
		// �� ��° ���� �Է�
		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ�. : ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println(sum);
		
		return;
	}

}
