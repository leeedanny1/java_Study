package ch03;

//생성자 02-03
// MainTest1 이랑 연결
public class Student {
	
	int number;
	String name;
	int grade;
	
	// 생성자 - constructor
	// 객체를 생성 할 때 다음과 같은 모양으로 만들어라고 지시하는 것
	// 객체를 생성 할 때 강제성을 부여하는 것
		
	// 기본 생성자
	// 컴파일러가 자동으로 생성해준다.
	// public 클래스명(){}
//	public Student(){
//		
//	}
	
	// 클래스에는 반드시 적어도 하나 이상의 생성자가 존재한다.
	// 클래스에 생성자가 하나도 없는 경우 컴파일러가 자동으로 생성자 코드를 넣어준다.
	
	
	// 사용자 정의 생성자 (개발자가 직접 정의)
	public Student(int n1, String n2, int n3) {
		number = n1;
		name = n2;
		grade = n3;		
	}
	
	// 생성자를 만들어주면, 기본생성자는 자동 생성되지 않는다.
	
}
