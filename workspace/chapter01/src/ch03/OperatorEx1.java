package ch03;

// ������ ��������
public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// 1
		// �� ���� ���� ���� �Ͽ� result1 ������ ���
		// ����� 30.5�� ��� �ϼ���.
		int i = 10;
		double d = 20.5;
		
		double result1 = i+d;
		System.out.println(result1);

		System.out.println("--------------------");
		
		
		// 2
		// result1 ������ ���������� ���� �� ��ȯ �ؼ� ����ϼ���
		System.out.println((int)result1);
		
		System.out.println("--------------------");


		// 3
		// i ������ ���� -1�� �� �� ����ϼ���
		// ��, ���� ������ ���
		System.out.println(--i);
		
		System.out.println("--------------------");


		// 4
		// d ������ ���� -20.5�� ��� �ϼ���
		// ��, d ������ ���� �������� ������
		System.out.println(-d);
		
		System.out.println("--------------------");


		// 5
		// ���� i�� d, ���� �����ڸ� ����ؼ� result2 ������ 
		// �����ϰ� ������ true ���� ��⵵�� ���� �����
		// ����ϼ��� 
		boolean result2;
		result2 = i < d;
		System.out.println(result2);
		
		System.out.println("--------------------");
		

		// 6
		// ���� result3�� �����ϰ�
		// num1�� num2 ������ ���� 50���� ū�� �� �����ڸ� ����ؼ� ����� ��� ����ϼ���
		int num1 = 10;
		int num2 = 30;

		boolean result3;
		result3 = (num1 > 50) && (num2 > 50);
		System.out.println(result3);
		
		System.out.println("--------------------");
		

		// 7
		// num1�� num2 �� �� ū ���� ���� �����ڸ� ����ؼ�
		// max ������ ���� ��� ������ּ���
		// ��, ����� �ʱ�ȭ�� ���ÿ� ���ּ���
		
		int max = num1 > num2 ? num1 : num2;
		System.out.println(max);

	}

}
