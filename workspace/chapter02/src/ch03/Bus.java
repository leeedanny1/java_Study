package ch03;

public class Bus {

	// ���� ��ȣ, ���ͱ�
	// ��������
	int busNumber;
	int money;
	
	
	//������
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public Bus(int busNumber, int money) {
		this.busNumber = busNumber;
		this.money = money;
	}
	
	
	// �޼ҵ�
	public void showInfo() {
		System.out.println("������ ��ȣ�� " + /* this. ��������*/busNumber + "�� �Դϴ�.");
	}
	
	public void showMoney() {
		System.out.println("������ ���ͱ��� " + money + "�� �Դϴ�.");
	}
	
}