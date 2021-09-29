package ch03;

public abstract class Car {

	public void startCar() {
		System.out.println("시동을 겁니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");	
	}
	
	public abstract void drive();
	public abstract void stop();
	
	
	// 후크(hook) 메소드
	// 필요하면 사용하는 클래스에서 직접 구현해서 사용하라
	public void washCar() {
		
	}
	
	
	
	// 핵심!!
	// 하위 클래스에서 재정의 할 수 없게 됨
	final public void run() {
		//메소드의 순서(템블릿을 지정할 수 있다)
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
	
}
