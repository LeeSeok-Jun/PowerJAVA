/*
 * chapter 24-05. ��ĳ�װ� ������
 * - ���� ���� ���ڿ��� �����Ͽ� �ټ��� �μ��� �����Ѵ�.
 * - format() �޼ҵ�� ���� �����ϰ� ������ �� �ִ�.
 */

package chapter24;

public class Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 8;
		double r = Math.log(i);
		
		System.out.format("log(" + "%d" + ")�� " + "%f" + "�Դϴ�. %n", i, r);
		// java������ \n�� �׻� ������Ʈ ���� (\\u000A) ���� �����Ѵ�.
		// ��Ȯ�� �ٹٲ��� ���ؼ��� %n�� ����ϴ� ���� �ٶ����ϴ�.
	}

}
