package ch01;

public class StudentMainTest1 {

//	main�Լ�(�ڵ��� ������)
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		Student s1; //Student ���� Ÿ�� s1��� ���� ����
		Student s2; //Student ���� Ÿ�� s2��� ���� ����
		s1 = new Student(); // s1���� �ʱ�ȭ(��ü����) ��üȭ. instance
		s2 = new Student(); // s2���� �ʱ�ȭ(��ü����) ��üȭ. instance
		
		
		System.out.println(num1);
		System.out.println(s1);
		System.out.println(s2);
		
		
	} // end of main

} //end of class