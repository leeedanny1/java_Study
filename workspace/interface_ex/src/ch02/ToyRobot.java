package ch02;

public class ToyRobot extends HomeAppliances implements RemoteController, SoundEffect {

	String name;

	@Override
	public void turnOn() {
		System.out.println("�峭�� �κ��� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("�峭�� �κ��� ���ϴ�.");

	}

	@Override
	public void notification() {
		System.out.println("�츮�����������̸�!@!!@~");

	}

}
