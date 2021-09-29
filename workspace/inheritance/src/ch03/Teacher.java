package ch03;

public class Teacher extends Person {
	
	/* 상속받았기에 필요없음
	String name;
	int age;
	int height;
	int weight;
	*/
	
	// 생성자
	public Teacher() {
		name = "홍선생";
		age = 37;
		height = 180;
		weight = 70;
	}
	
	/* 상속받았기에 필요없음
	//메소드
	public void showInfo() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("height: " + height);
		System.out.println("weight: " + weight);	
	}
	*/

}
