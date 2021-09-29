package ch01;

// 추상클래스 에약어
public abstract class Animal {
	
	// 추상클래스(abstract class)
	// 구현 코드 없이 메서드의 선언만 있는 추상 메서드(abstract method)를 포함한 클래스
	
	public String name;
	
	// 일반 메소드
	public void move() {
		System.out.println("이동합니다.");
	}
	
	//추상메소드
	public abstract void hunt();
	
	//메인함수
	public static void main(String[] args) {
		// 추상 클래스는 일반적으로 사용했던 new 키워드를 사용해서 객체로 만들 수 없다.
		// new Animal();
	}
	
}
