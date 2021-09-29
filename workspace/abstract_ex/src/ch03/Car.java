package ch03;

public abstract class Car {

	public void startCar() {
		System.out.println("�õ��� �̴ϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");	
	}
	
	public abstract void drive();
	public abstract void stop();
	
	
	// ��ũ(hook) �޼ҵ�
	// �ʿ��ϸ� ����ϴ� Ŭ�������� ���� �����ؼ� ����϶�
	public void washCar() {
		
	}
	
	
	
	// �ٽ�!!
	// ���� Ŭ�������� ������ �� �� ���� ��
	final public void run() {
		//�޼ҵ��� ����(�ۺ��� ������ �� �ִ�)
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
	
}
