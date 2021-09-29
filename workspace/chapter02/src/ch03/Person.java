package ch03;

public class Person {
	
	// 변수선언
	int height, weight, age;
	String gender, name;
	
	// 생성자
	public Person(int height, int weight, int age, String gender, String name) {
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
		this.name = name;
	}
	
	// 메소드
	public void showInfo() {
		System.out.println("키가 " + height + "이고 몸무게가 " + weight + "킬로인 " + gender + "이 있습니다. 이름은 " + name + "이고 나이는" + age + "세 입니다.");
		
	}



	// main
	public static void main(String[] args) {
		Person p1 = new Person(180, 78, 37, "남성", "Tomas");
		p1.showInfo();
	}

}
