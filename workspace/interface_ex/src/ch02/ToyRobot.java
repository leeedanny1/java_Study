package ch02;

public class ToyRobot extends HomeAppliances implements RemoteController, SoundEffect {

	String name;

	@Override
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다.");

	}

	@Override
	public void notification() {
		System.out.println("띠리리리링ㅇ리이리!@!!@~");

	}

}
