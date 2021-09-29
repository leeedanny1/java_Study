package ch03;

// 03-01. 연산자
public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 산술연산자
		int number1 = 5 + 3;	//덧셈
		int number2 = 5 - 2;	//뺄셈
		int number3 = 5 * 3;	//곱셈
		int number4 = 5 / 4;	//나누기
		int number5 = 5 % 3;	//나머지
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		
		
		System.out.println("--------------------------");
		
		// 문제
		//1. (12+3)/3의 값을 화면에 출력해 보세요. (변수명:number6)
		int number6 = (12+3)/3;
		System.out.println(number6);
		
		//2. (25%2)의 값을 변수에 담지 말고 화면에 바로 출력해 보세요.
		System.out.println(25%2);
	}

}
