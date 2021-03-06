package ch04;

import java.util.Iterator;

public class FruitMainTest {

	public static void main(String[] args) {

		Peach peach = new Peach();
		Banana banana = new Banana();
		
		peach.showInfo();
		banana.showInfo();
		
		

//		다형성
//		클래스를 다양한 형태로 바라본다.
//		
//		ex) 배
//		신체의 배, 과일의 배, 운송수단의 배..
//		
//		다형성이란 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
//		같은 코드에서 여러 다른 실행 결과가 나올 수도 있다.
//		정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나이다. 
//		다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들 수 있다.		

		
		System.out.println("--------------------------");
		
		Fruit[] basket = new Fruit[4];
		basket[0] = new Banana();
		basket[1] = new Peach();
		basket[2] = new Peach();
		basket[3] = new Peach();
		
		System.out.println(banana.origin); //?
		// .연산자를 사용하게 되면 객체의 타입까지만 확인할 수 있다.
		// Banana클래스의 origin멤버 변수에 접근하기 위해서는 다운 캐스팅을 해야한다.
		String temp = ((Banana)basket[0]).origin;
		
		// instanceof 연산자
		if(basket[0] instanceof Banana) {
			System.out.println("바나나 타입 입니다.");
		} else {System.out.println("복숭아 타입 입니다.");			
		}
		if(basket[1] instanceof Peach) {
			System.out.println("복숭아 타입 입니다.");
		}else {
			System.out.println("바나나 타입 입니다.");
		}
		
		//for문을 사용해 바나나 타입일 경우 화면에 origin 값을 출력 해 보세요
		for (int i = 0; i < basket.length; i++) {
			if(basket[i] instanceof Banana) {
				System.out.println(banana.origin);
			}
		}
		

	}

}
