package ch04;

public class Bus {

	//������ȣ, �°� ��, ���Ա�
	int busNo;
	int passengerCount;
	int money;
	
	// ������
	public Bus(int busNo) {
		this.busNo = busNo;
	}
	
	// �޼ҵ�
	public void showInfo() {
		System.out.println(busNo + "�� ������ �°��� " + passengerCount + "�� �̰�, ���Ա��� " + money + "�� �Դϴ�.");
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount ++;
	}
	
	
	//main
	public static void main(String[] args) {
		
	}
	
}
