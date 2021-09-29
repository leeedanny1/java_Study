package ch02;

// 인터페이스는 extends가 아니라 implements임!
public class Televison extends HomeAppliances implements RemoteController{

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

}
