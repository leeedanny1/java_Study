package ch10;

public class Marine {

	// 캐릭터 이름, 공격력, 체력
	private String name;
	private int power;
	private int hp;

	// 생성자
	// 공격력 5, 체력 100
	public Marine(String name) {
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
	
	// 마린이 질럿을 공격합니다.
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
		zealot.beAttacked(this.power);
	}
	
	// 마린이 저글링을 공격합니다.
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name + "이 "+ zergling.getName() + "을 공격합니다.");
		zergling.beAttacked(this.power);		
	}
	
	
	// ===== 메소드 오버로딩을 이용해 봅시다. =====
	public void attack(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
		zealot.beAttacked(this.power);
	}
	
	public void attack(Zergling zergling) {
		System.out.println(this.name + "이 " + zergling.getName() + "을 공격합니다.");
		zergling.beAttacked(this.power);		
	}
	
	
	
	// 마린이 공격을 당합니다.
	public void beAttacked(int power) {
		this.hp -= power;
		if(this.hp <=0) {
			System.out.println(this.name + "은 사망하였습니다.");
			this.hp = 0;
			
		}

		
	}
	
	
	
}
