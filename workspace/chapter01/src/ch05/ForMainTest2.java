package ch05;

import java.util.Scanner;

//05-01. for반복문
public class ForMainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for반복문으로 구구단 연습
		
		int num = 5;
		for(int i=1; i<=9; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
		System.out.println();
		
		num = 6;
		for(int i=1; i<=9; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
		System.out.println();
		
		num = 7;
		for(int i=1; i<=9; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
		System.out.println();
		
		num = 8;
		for(int i=1; i<=9; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
		System.out.println();
		
		num = 9;
		for(int i=1; i<=9; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
		System.out.println();
		
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 '단'을 숫자만 입력하세요: ");
		int num=sc.nextInt();

		System.out.println("--------------------------------");
		System.out.println(num + "단을 선택하셨습니다.");
		for(int i=1; i<=9; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
		*/



	}

}
