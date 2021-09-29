package ch03;

//03-01. 연산자
public class MainTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 논리연산자 (&&. ||, !)
		// 관계연산자와 혼합해서 많이 사용됨.
		// 연산의 결과가 true, false
		
		// 1. 논리곱 (&&)
		// 두개 모두 true 이면 연산의 결과는 true
		int num1 = 10;
		int num2 = 20;
		boolean flag1 = num1 > 0  &&  num2 > 0;
		System.out.println(flag1);
		
		boolean flag2 = num1 > 0 && num2 < 0;
		System.out.println(flag2);
		
		
		// 2. 논리합 (||)
		// 둘 중 하나라도 true 이면 연산의 결과는 true
		boolean flag3 = num1 > 0 || num2 > 0;
		System.out.println(flag3);
		
		boolean flag4 = num1 < 0 || num2 > 0;
		System.out.println(flag4);
	}

}
