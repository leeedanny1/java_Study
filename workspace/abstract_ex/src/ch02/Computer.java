package ch02;

public abstract class Computer {

	//�߻�޼���
	public abstract void display();
	public abstract void typing();
	//�Ϲݸ޼ҵ�
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
