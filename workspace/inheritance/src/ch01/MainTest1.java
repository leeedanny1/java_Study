package ch01;

// 하나의 .JAVA파일 안에 여러개의 클래스 생성 가능.

// public클래스가 될 수 없다.
class A {
	int number1;
	int number2;
	int number3;
}


class B{
	int number1;
	int number2;
	int number3;
	int number4;
	int number5;
}


// C클래스는 A클래스를 상속받겠다.
class C extends A{
	int number4;
	int number5;
}



public class MainTest1 {

	public static void main(String[] args) {

		C c1 = new C();
		c1.number1 = 1;
		c1.number2 = 2;
		c1.number5 = 5;
		
		System.out.println(c1.number1);
		System.out.println(c1.number2);
		System.out.println(c1.number5);
	}

}
