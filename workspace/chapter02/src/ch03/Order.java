package ch03;

public class Order {
	
	// ���� ����
	long number, phone;
	String address;
	int date, time, price, menuNo;
	
	// ������
	public Order(long number, long phone, String address, int date, int time, int price, int menuNo) {
		this.number = number;
		this.phone = phone;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNo = menuNo;
	}
	
	// �޼ҵ�
	public void showInfo() {
		System.out.println("������ȣ: " + number);
		System.out.println("�ֹ� �ڵ��� ��ȣ: " + phone);
		System.out.println("�ֹ� �� �ּ�: " + address);
		System.out.println("�ֹ� ��¥: " + date);
		System.out.println("�ֹ� �ð�: " + time);
		System.out.println("�ֹ� ����: " + price);
		System.out.println("�޴� ��ȣ: " + menuNo);
	}
	
	
	// main
	public static void main(String[] args) {
		Order o1 = new Order(2106250003, 01023450001, "�λ�� �ؿ�뱸 �쵿 111-333", 20210625, 130258, 35000, 0003);
		o1.showInfo();
		
	}
	
	

}
