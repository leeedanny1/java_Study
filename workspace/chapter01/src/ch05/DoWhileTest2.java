package ch05;

import java.util.Scanner;

public class DoWhileTest2 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
				
		int input, sum=0;
		
		
		System.out.print("덧셈할 정수를 입력하세요: ");
		
		do {
			input = sc.nextInt();
			if(input == 0) {
				System.out.println("프로그램을 종료합니다.");
			} else {
				System.out.print("다음 정수를 입력하세요: ");
			}
			sum += input;
		} while(input != 0);
		
		System.out.println("덧셈 결과값: " + sum);
		
	}

}
