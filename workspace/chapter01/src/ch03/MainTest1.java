package ch03;

// 03-01. 연산자
public class MainTest1 {

	public static void main(String[] args) {
		

		// 대입연산자 (=)
		
		int num = 10;
		// 대입연산의 방향은 오른쪽에서 왼쪽으로 진행된다.
		
		int num2 = num;
		// 변수에 변수를 대입 할 수 있다.
		
		System.out.println(num);
		System.out.println(num2);

		
		System.out.println("------------------------");
		
		
		// 부호연산자 (+, -)
		// 부호를 변경하는 연산자입니다.
		// 단, 변수에 들어있는 실제 값을 변경하지는 않습니다.
		System.out.println(-num);
		System.out.println(num);
		
		
		System.out.println("--------------------------");
		
		
		// 변수의 실제 값을 변경하려면 대입연산자를 사용해야 한다.
		num = -num;
		System.out.println(num);
		
		
	}

}
