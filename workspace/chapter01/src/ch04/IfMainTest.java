package ch04;

import java.util.Scanner;

//04-01. ���ǹ�
public class IfMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��� if
		//�־��� ���ǿ� ���� ������ �̷�� ������ ����

		boolean flag = true;

		// flag = false;


		// �ܵ� if��
		if(flag) {
			System.out.println("���ǽ��� true�̸� ���� �˴ϴ�.");
		}

		
		//if else��
		if(flag) {
			System.out.println("true�Դϴ�.");
		} else {	
			System.out.println("false�Դϴ�.");
		}

		
		//else if��
		//Scanner�� �̿��� ������ �Է¹ް� if������ ��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���: ");
		int point = sc.nextInt();
		
		if(point >= 90) {
			System.out.println("A���� �Դϴ�.");
		} else if(point >= 80) {
			System.out.println("B���� �Դϴ�.");
		} else if(point >= 70) {
			System.out.println("C���� �Դϴ�.");
		} else if(point >= 60) {
			System.out.println("D���� �Դϴ�.");
		} else {
			System.out.println("F���� �Դϴ�.");
		}
		

	}

}
