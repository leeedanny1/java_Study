package ch02;

public class Warrior extends Hero{

	// 부모클래스에 사용자정의 생성자가 있으므로 그 생성자를 호출 해주어야 함
	public Warrior(String name, int hp) {
		super(name, hp);
	}

	public void comboAttack() {
		System.out.println("2단공격");
	}

}
