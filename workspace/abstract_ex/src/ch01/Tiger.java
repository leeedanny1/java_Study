package ch01;

public class Tiger extends Animal {

	// 재정의 - 오버라이드
	@Override
	public void hunt() {
		System.out.println("호랑이가 앞발로 사냥을 합니다.");
	}

	@Override
	public void move() {
		System.out.println("살금살금 조용히 이동 합니다.");
	}
	
	// 해결책
	//1. 추상 메소드를 직접 재정의해서 구현한다.
	//2. Tiger클래스도 추상 클래스로 만들어 준다.
	
	

}
