package ch02;

public class Car{

	String name;
	int price;
	// ���԰���� �����ؾ��Ѵ�.
	Engine engine;
	
	// ������
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		this.engine = new Engine("GDI", 400);
	}
	
	
	
}
