package ch03;

//03-01. 연산자
public class MainTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 관계연산자
		// 관찰의 결과를 참, 거짓으로 판별 할 때 사용
		// 결과값은 오직 true 또는 false이다.
		
		int num1 = 5;
		int num2 = 3;
		
		// 가독성을 높여주기 위해 괄호 사용
		boolean value1 = (num1 < num2);
		
		System.out.println(value1);
		
		boolean value2 = (num1 > num2);
		System.out.println(value2);

		boolean value3 = (num1 == num2);
		System.out.println(value3);
	}

}
