package ch09;

// 싱글톤패턴
public class Company {

	//1. 생성자를 private으로 만든다.
	private Company() {
		
	}
	
	//2. static 변수를 활용해서 내부에서 객체를 생성한다.
	private static Company instance = new Company();
	
	//3. 외부에서 유일한 인스턴스(객체)를 참조할 수 있는 public 메서드를 제공
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
