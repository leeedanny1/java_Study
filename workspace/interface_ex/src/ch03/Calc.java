package ch03;

public interface Calc {
	
	// �������̽��� ����� �����
	double PI = 3.14;
	int ERROR = -99999;
	
	
	// ����1
	// add�޼ҵ�, �Ű�����(num1, num2)
	// substract, �Ű�����(num1, num2)
	// times, ...
	// divide, ...
	
	// �߻�޼ҵ� ����
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	void showInfo();

}
