package ch01;

// 01-02 ������ Ÿ��
//������
public class DataType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������
		byte b;
		short s;
		int i;
		long l;
		
		
		
		// byte �� ũ��� +-128
		b = 127;
		System.out.println(b);
		b = -128;
		System.out.println(b);
		// b = 128;		byte�� ������ �ʰ�
		// b = -129;

		
		// int �� ũ��� �� +-21�� ����
		i = 2100000000;
		System.out.println(i);
		
		
		// longŸ���� ���� �ڿ� L�� �ٿ���� ��.
		// �򰥸� �� ������ �빮�� L�� ������.
		// �̸� ���̻��� ��.
		l = 2200000000L;
		System.out.println(l);
		
		
	}

}
