package ch02;

// �������̽��� extends�� �ƴ϶� implements��!
public class Televison extends HomeAppliances implements RemoteController{

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

}
