package ch06;

public class Engine {
	
	// 엔진의 이름
	String name;
	// 엔진의 가격
	int price;
	
	
	// 생성자
	public Engine(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// method
	public void showInfo() {
		System.out.println("name: " + name);
		System.out.println("price: " + price);
	}
	
	
	

}
