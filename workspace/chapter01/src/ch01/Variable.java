package ch01;

// 01-01 변수의 정의와 규칙
// 변수
public class Variable {

	public static void main(String[] args) {
		// 변수
		// 변수는 값을 저장 할 수 있는 메모리 공간을 의미한다.
		// 이름에서 알 수 있듯이 변하는 수, 변할 수 있는 수 입니다.
		
		int id = 101; // 선언과 초기화를 동시에 처리
		// int 	<- 데이터의 자료형
		// id 		<- 변수
		// 101	<- 변수값(데이터:수치)
		
		//문제1 id값을 500으로 변경해보자.
		id = 500;
		
		
		
		// 변수의 이름을 만들 때 규칙
		
		// 1. 대소문자 구별하며, 변수명의 길이에 제한이 없다.
		int name = 100;
		int Name = 200; // 단, 변수명을 처음부터 대문자로 표기하지는 않는다.
		
		// 2. 자바에서는 JDK가 미리 정해놓은 예약어를 변수명으로 사용할 수 없다.
//		int if;
//		int for;
//		int while;
		
		// 3. 변수는 숫자로 시작할 수 없다.
//		int 7name;
//		int 55age;
		int n7ame;
		int a55ge;
		
		// 4. 특수문자는 _ 와 $ 두개만 사용 가능하다.
		int _age;
		int $age;
		int a_$g$_e;
//		int #age;
		
		
		
		//------------------------------------------------------------------------------------		
		
		
		
		// 변수를 사용하는 방법
		
		// 변수 선언
		int age;
		int count;
		
		// 변수 초기화(값을 넣다)
		age = 10;
		count = 100;
		
		// 변수값 출력, 문자열과 변수값등 모두 출력 가능
		System.out.println(age);
		System.out.println(count);
		
		age = 300;
		System.out.println(age);
		count = 500;
		System.out.println(count);

		
		// 변수 선언과 초기화를 동시에
		int age2 = 20;
		int count2 = 77;
		System.out.println(age2);
		System.out.println(77);
		
	}

}
