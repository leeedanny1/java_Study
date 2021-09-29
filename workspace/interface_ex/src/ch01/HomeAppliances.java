package ch01;

//추상클래스
// 이 클래스를 직접 new 해서 사용할 필요 없다.
// 때문에 추상 클래스로 만들어줄 수 있다.
public abstract class HomeAppliances {

	int width;
	int height;
	String color;

	// 추상 메소드
	public abstract void turnOn();
	public abstract void turnOff();
	
	
}
