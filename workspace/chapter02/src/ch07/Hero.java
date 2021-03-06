package ch07;

public class Hero {

	private String name;
	private int hp;
	private int power;

	public Hero(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.power = power;
	}

	// getter, setter
	// getter - read only
	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	//setter을 이용한 방어적 (컨트롤) 코드 작성 가능
	public void setHp(int hp) {
		if (hp < 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.hp = hp;
		}
	}

	public void setPower(int power) {
		this.power = power;
	}

}
