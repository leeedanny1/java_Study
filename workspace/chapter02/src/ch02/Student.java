package ch02;

import java.util.Random;

public class Student {

	// ��ü�� �Ӽ��� ���������, ��ü�� ����� �޼ҵ�� �����Ѵ�.
	int studentId;
	String studentName;
	String address;
	
	// �޼ҵ� ����
	public void study() {
		System.out.println(studentName + "�л��� ���θ� �մϴ�.");
	}
	public void breakTime() {
		System.out.println(studentName + "�л��� �޽��� �մϴ�.");		
	}
	public void showInfo() {
		System.out.println(studentId + ", " + studentName + ", " + address);		
	}
	
	
	// main 
	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "��浿";
		studentKim.studentId = 1;
		studentKim.address = "�λ�� �ؿ�뱸";
		
		// �޼ҵ� ȣ��
		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();

		
		System.out.println("---------------------------");
		
		
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.studentId = 2;
		studentLee.address = "�λ�� ������";
		
		studentLee.study();
		studentLee.breakTime();
		studentLee.showInfo();
		
		
		System.out.println("----------------------------");
		
		
		//�Լ� ����
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		
		
	}
	
	
	// �Լ������
	public static int randomNumber() {
		int value;
		Random random = new Random();
		// 1���� 45������ ���� �� �ϳ��� ��ȯ
		value = random.nextInt(45) + 1;
		return value;
	}
	
	
	
	
	
	
	
	
	
	
}