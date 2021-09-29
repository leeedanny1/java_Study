package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 문제1. 
		// Animal타입으로 호랑이 생성
		// Animal타입으로 독수리 생성
		// Animal타입으로 사람 생성
		// 다형성
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal person = new Person();
		
		// 문제2.
		// Animal 타입으로 배열을 선언해 보세요. 배열의 크기는 3
		Animal[] animals = new Animal[3];
		
		// 문제3.
		animals[0] = tiger;
		animals[1] = eagle;
		animals[2] = person;
		
		
		// (tiger, eagle, person) move, hunt 메소드 호출
		// for문 사용해서 생성
		for (int i = 0; i < animals.length; i++) {
			animals[i].move();
			animals[i].hunt();
			
		}
		
		

	}

}
