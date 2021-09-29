package ch03;

public class Order {
	
	// 변수 선언
	long number, phone;
	String address;
	int date, time, price, menuNo;
	
	// 생성자
	public Order(long number, long phone, String address, int date, int time, int price, int menuNo) {
		this.number = number;
		this.phone = phone;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNo = menuNo;
	}
	
	// 메소드
	public void showInfo() {
		System.out.println("접수번호: " + number);
		System.out.println("주문 핸드폰 번호: " + phone);
		System.out.println("주문 집 주소: " + address);
		System.out.println("주문 날짜: " + date);
		System.out.println("주문 시간: " + time);
		System.out.println("주문 가격: " + price);
		System.out.println("메뉴 번호: " + menuNo);
	}
	
	
	// main
	public static void main(String[] args) {
		Order o1 = new Order(2106250003, 01023450001, "부산시 해운대구 우동 111-333", 20210625, 130258, 35000, 0003);
		o1.showInfo();
		
	}
	
	

}
