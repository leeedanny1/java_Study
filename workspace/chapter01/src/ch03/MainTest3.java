package ch03;

//03-01. 연산자
public class MainTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 증감연산자 (++, --)
		
		int num1 = 1;
		// num1 = num1 + 1;
		num1++;
		System.out.println(num1);
		
		int num2 = 1;
		// num2 = num2 - 1;
		num2--;
		System.out.println(num2);
		
		
		System.out.println("-------------------------");
		
		
		// 혼동 주의!!!
		// 1. 증감 연산자가 뒤에 올 경우
		int num3 = 10;
		int num4;
		
		num4 = num3++;
		System.out.println("num3의 현재값: " + num3);
		System.out.println("num4의 현재값: " + num4);
		
		// 2. 증감연산자가 앞에 올 경우
		int num5 = 10;
		int num6;
		
		num6 = ++num5;
		System.out.println("num5의 현재값: " + num5);
		System.out.println("num6의 현재값: " + num6);
		
		
		// 결론: 증감 연산자는 변수에 있는 값을 1 증가(감소) 시킬 뿐이다.
		// 단 앞에 있을 때와 뒤에 있을 떄 연산 순서가 다르다
		
		
	}

}
