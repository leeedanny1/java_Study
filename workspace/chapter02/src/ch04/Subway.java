package ch04;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	
	// �޼ҵ�
	public void take(int money) {
		this.money = money;
		this.passengerCount ++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "ȣ�� ����ö�� �°��� " + passengerCount + "�� �̰�, ���Ա��� " + money + "�� �Դϴ�.");
	}
	

}
