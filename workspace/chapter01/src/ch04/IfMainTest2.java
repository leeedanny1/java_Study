package ch04;

import java.util.Scanner;

//04-01. ���ǹ�
public class IfMainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("������ �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		
		int point = sc.nextInt();
		char result = 'X';
		
		if(point <= 100 && point >= 90) {
			result = 'A';
		} else if(point < 90 && point >= 80) {
			result = 'B';
		} else if(point < 80 && point >= 70) {
			result = 'C';
		} else if(point < 70 && point >= 60) {
			result = 'D';
		} else if(point < 60 && point >= 0) {
			result = 'F';
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
		
		if(result != 'X') {
			System.out.println("����� ������ " + result + "�Դϴ�.");
		}

	}

}