package ch09;

public class Barlon {

	//1. 생성자를 private으로 만든다.
	private Barlon() {}
	
	//2. static 변수를 활용해서 내부에서 객체를 생성한다.
	private static Barlon instance = new Barlon();
	
	//3. 외부에서 유일한 인스턴스(객체)를 참조할 수 있는 public 메서드를 제공
	public static Barlon getInstance() {
		if(instance == null) {
			instance = new Barlon();
		}
		return instance;
	}
	
	
	// main
	public static void main(String[] args) {
		Barlon barlon = Barlon.getInstance();
		System.out.println(barlon);
	}
	
}
