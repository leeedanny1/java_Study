package ch04;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	
	// 메소드
	public void take(int money) {
		this.money = money;
		this.passengerCount ++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "호선 지하철의 승객은 " + passengerCount + "명 이고, 수입금은 " + money + "원 입니다.");
	}
	

}
