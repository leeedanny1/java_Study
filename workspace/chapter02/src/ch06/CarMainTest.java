package ch06;

public class CarMainTest {

	public static void main(String[] args) {
		
		Car c1 = new Car("GENESIS", 5000);
		c1.showInfo();
		c1.engine.showInfo();
		System.out.println(c1.engine.name);
		System.out.println(c1.engine.price);
		System.out.println(c1.engine);

	}

}
