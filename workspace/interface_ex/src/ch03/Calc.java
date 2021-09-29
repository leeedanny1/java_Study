package ch03;

public interface Calc {
	
	// 인터페이스는 상수로 선언됨
	double PI = 3.14;
	int ERROR = -99999;
	
	
	// 문제1
	// add메소드, 매개변수(num1, num2)
	// substract, 매개변수(num1, num2)
	// times, ...
	// divide, ...
	
	// 추상메소드 선언
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	void showInfo();

}
