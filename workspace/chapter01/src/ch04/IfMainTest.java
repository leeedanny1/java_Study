package ch04;

import java.util.Scanner;

//04-01. 조건문
public class IfMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 제어문 if
		//주어진 조건에 따라서 실행이 이루어 지도록 구현

		boolean flag = true;

		// flag = false;


		// 단독 if문
		if(flag) {
			System.out.println("조건식이 true이면 실행 됩니다.");
		}

		
		//if else문
		if(flag) {
			System.out.println("true입니다.");
		} else {	
			System.out.println("false입니다.");
		}

		
		//else if문
		//Scanner를 이용해 점수를 입력받고 if문으로 비교
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		int point = sc.nextInt();
		
		if(point >= 90) {
			System.out.println("A학점 입니다.");
		} else if(point >= 80) {
			System.out.println("B학점 입니다.");
		} else if(point >= 70) {
			System.out.println("C학점 입니다.");
		} else if(point >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
		

	}

}
