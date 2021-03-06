package ch02;

import java.util.Random;

public class Student {

	// 객체의 속성은 멤버변수로, 객체의 기능은 메소드로 구현한다.
	int studentId;
	String studentName;
	String address;
	
	// 메소드 정의
	public void study() {
		System.out.println(studentName + "학생이 공부를 합니다.");
	}
	public void breakTime() {
		System.out.println(studentName + "학생이 휴식을 합니다.");		
	}
	public void showInfo() {
		System.out.println(studentId + ", " + studentName + ", " + address);		
	}
	
	
	// main 
	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "김길동";
		studentKim.studentId = 1;
		studentKim.address = "부산시 해운대구";
		
		// 메소드 호출
		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();

		
		System.out.println("---------------------------");
		
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentId = 2;
		studentLee.address = "부산시 남포동";
		
		studentLee.study();
		studentLee.breakTime();
		studentLee.showInfo();
		
		
		System.out.println("----------------------------");
		
		
		//함수 실행
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		System.out.println(randomNumber());
		
		
	}
	
	
	// 함수만들기
	public static int randomNumber() {
		int value;
		Random random = new Random();
		// 1부터 45사이의 숫자 중 하나를 반환
		value = random.nextInt(45) + 1;
		return value;
	}
	
	
	
	
	
	
	
	
	
	
}
