package ch02;

public abstract class Computer {

	//추상메서드
	public abstract void display();
	public abstract void typing();
	//일반메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
