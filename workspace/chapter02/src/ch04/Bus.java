package ch04;

public class Bus {

	//버스번호, 승객 수, 수입금
	int busNo;
	int passengerCount;
	int money;
	
	// 생성자
	public Bus(int busNo) {
		this.busNo = busNo;
	}
	
	// 메소드
	public void showInfo() {
		System.out.println(busNo + "번 버스의 승객은 " + passengerCount + "명 이고, 수입금은 " + money + "원 입니다.");
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
	}
	
	
	//main
	public static void main(String[] args) {
		
	}
	
}
