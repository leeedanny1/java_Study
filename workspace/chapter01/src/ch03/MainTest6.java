package ch03;

import java.util.Scanner;

//03-01. 연산자
public class MainTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 삼항연산자 (조건연산자)
		// 조건식 ? 참일때 결과 : 거짓일때 결과;
		
		int num1 = (5>3) ? 10 : 20;
		System.out.println(num1);
		
		int num2 = (5<3) ? 10 : 20;
		System.out.println(num2);
		
		
		
		// JDK가 만들어준 도구를 이용해 봅시다.
		//Scanner를 통한 두 수 비교하는 프로그램
		int max;
		System.out.println("입력받은 두 수 중 큰 수를 출력하세요!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("입력1: ");
		int x = sc.nextInt();
		System.out.println("입력2: ");
		int y = sc.nextInt();
		
		max = (x > y) ? x : y;
		System.out.println("입력받은 두 수 중 큰 수는 " + max + "입니다.");
		
	}

}
