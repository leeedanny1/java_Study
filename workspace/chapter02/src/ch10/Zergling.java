package ch10;

public class Zergling {

	// 캐릭터 이름, 공격력, 체력
	private String name;
	private int power;
	private int hp;

	// 생성자
	// 공격력5, 체력100
	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}

	// getter
	// this없어도 되지만 코딩 스타일링을 위해 작성 해 줌
	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}

	public int getHp() {
		return this.hp;
	}

	// 메소드
	public void showInfo() {
		System.out.println("=====" + this.name + "의 정보창=====");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("체력: " + this.hp);
		System.out.println("=============");
	}
	
	// 질럿을 공격합니다.
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
		zealot.beAttacked(this.power);
	}
	
	// 마린을 공격
	public void attackMarine(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
		marine.beAttacked(this.power);
	}
	
	
	// ===== 메소드 오버로딩을 이용해 봅시다. =====
	public void attack(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
		zealot.beAttacked(this.power);
	}
	
	public void attack(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
		marine.beAttacked(this.power);		
	}
	
	// 저글링이 공격을 받습니다.
	public void beAttacked(int power) {
		this.hp -= power;
		if(this.hp <=0) {
			System.out.println(this.name + "은 사망하였습니다.");
			this.hp = 0;
		}
	}

}
