package ch03;

//03-01. ������
public class MainTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// �������� (&&. ||, !)
		// ���迬���ڿ� ȥ���ؼ� ���� ����.
		// ������ ����� true, false
		
		// 1. ���� (&&)
		// �ΰ� ��� true �̸� ������ ����� true
		int num1 = 10;
		int num2 = 20;
		boolean flag1 = num1 > 0  &&  num2 > 0;
		System.out.println(flag1);
		
		boolean flag2 = num1 > 0 && num2 < 0;
		System.out.println(flag2);
		
		
		// 2. ���� (||)
		// �� �� �ϳ��� true �̸� ������ ����� true
		boolean flag3 = num1 > 0 || num2 > 0;
		System.out.println(flag3);
		
		boolean flag4 = num1 < 0 || num2 > 0;
		System.out.println(flag4);
	}

}
