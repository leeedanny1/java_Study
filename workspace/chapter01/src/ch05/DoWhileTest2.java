package ch05;

import java.util.Scanner;

public class DoWhileTest2 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
				
		int input, sum=0;
		
		
		System.out.print("������ ������ �Է��ϼ���: ");
		
		do {
			input = sc.nextInt();
			if(input == 0) {
				System.out.println("���α׷��� �����մϴ�.");
			} else {
				System.out.print("���� ������ �Է��ϼ���: ");
			}
			sum += input;
		} while(input != 0);
		
		System.out.println("���� �����: " + sum);
		
	}

}