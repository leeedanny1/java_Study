package ch01;

public class FunctionTest2 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		double result1 = addNum(20.5, 10.7);
		System.out.println(result1);
		
		sayHello("�ݰ����ϴ�. ó�����׿�~");
		
		int result2 = calcSum();
		System.out.println(result2);
		
	}

	// �Լ�
	public static double addNum(double n1, double n2) {
		double result;
		result = n1 + n2;
		return result;
	}

	// ���ϰ��� ���� �Լ� ����
	public static void sayHello(String greeting) {
		System.out.println("[" + greeting + "]");
	}

	// �Ű������� ���� �Լ� ����
	public static int calcSum() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
