package ch02;

// 02-02. ����ȯ
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����ȯ
		// ����ȯ: ���� �ٸ� �ڷ��� ���� ������� ������ ���� �ϳ��� �ڷ������� �����ϴ� ��.
		// 1. ������ �� ��ȯ (�ڵ� �� ��ȯ)
		// 2. ����� �� ��ȯ (���� �� ��ȯ)
		
		// ex) int �ڷ����� double������ �����ϰų� double�ڷ����� int�ڷ������� �����ϴ°�
		
		
		int iNum1 = 100;
		double dNumber = 1.12345;
		System.out.println(iNum1);
		System.out.println(dNumber);
		
		// �ڵ� �� ��ȯ
		// int���� double ������ �־����� �ڵ����� double�ڷ������� �ٲ�
		double dNum1 = iNum1;
		System.out.println(dNum1);
		
		// ���� �� ��ȯ
		// ū �ڷ����� ���� �ڷ����� �������� ���� �� ��ȯ�� �ʿ��ϴ�.
		// int iNumber = dNumber;
		int iNumber = (int)dNumber;
		System.out.println(iNumber);
		// �Ҽ��� ���� �� ������ �����͸� ����
		// ���� �� ��ȯ�� �������� �ս��� �߻��Ѵ�.
		
		
		
		
		
		System.out.println("------------------------------------");
		//��������
		double dValue;
		int iValue;
		
		dValue = 0.5;
		iValue = (int)10.9; //����� ����ȯ
		
		//����. iValue�� ��°��� ���ϱ��?
		System.out.println(iValue);
	}

}
