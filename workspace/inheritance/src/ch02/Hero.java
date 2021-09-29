package ch02;

public class Hero {

	String name;
	int hp;
	
	// 생성자
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	// 메소드
	public void attack() {
		System.out.println(name + "의 기본공격");
	}
	
	
	
}
