package ch03;

import java.util.Scanner;

//03-01. ������
public class MainTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ���׿����� (���ǿ�����)
		// ���ǽ� ? ���϶� ��� : �����϶� ���;
		
		int num1 = (5>3) ? 10 : 20;
		System.out.println(num1);
		
		int num2 = (5<3) ? 10 : 20;
		System.out.println(num2);
		
		
		
		// JDK�� ������� ������ �̿��� ���ô�.
		//Scanner�� ���� �� �� ���ϴ� ���α׷�
		int max;
		System.out.println("�Է¹��� �� �� �� ū ���� ����ϼ���!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�1: ");
		int x = sc.nextInt();
		System.out.println("�Է�2: ");
		int y = sc.nextInt();
		
		max = (x > y) ? x : y;
		System.out.println("�Է¹��� �� �� �� ū ���� " + max + "�Դϴ�.");
		
	}

}
