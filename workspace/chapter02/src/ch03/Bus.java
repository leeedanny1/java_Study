package ch03;

public class Bus {

	// 버스 번호, 수익금
	// 변수선언
	int busNumber;
	int money;
	
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public Bus(int busNumber, int money) {
		this.busNumber = busNumber;
		this.money = money;
	}
	
	
	// 메소드
	public void showInfo() {
		System.out.println("버스의 번호는 " + /* this. 생략가능*/busNumber + "번 입니다.");
	}
	
	public void showMoney() {
		System.out.println("버스의 수익금은 " + money + "원 입니다.");
	}
	
}
