package ch02;

public class Engine {

	String name;
	int price;
	
	// »ý¼ºÀÚ
	public Engine(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("name: " + name);
		System.out.println("price: " + price);
		
	}
	
	
	
}
