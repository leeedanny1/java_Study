package ch04;

// new키워드를 사용해 메모리에 오릴ㄹ 수 없다.
public abstract class Unit {

	// 변수
	protected String name;
	protected int power;
	protected int hp;
	
	
	//getter
	public String getName() {
		return name;
	}


	public int getPower() {
		return power;
	}


	public int getHp() {
		return hp;
	}


	// 메소드
	// 정보
	public void showInfo() {
		System.out.println("=====" + this.name + "의 정보창=====");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("체력: " + this.hp);
		System.out.println("=============");
	}
	
	//공격하기
	public void attack(Unit unit) {
		System.out.println(this.name + "이 " + unit.getName() + "을 공격합니다.");
		unit.beAttacked(this.power);		
	}
	
	//공격당함
	public void beAttacked(int power) {
		this.hp -= power;
		if(this.hp <=0) {
			System.out.println(this.name + "은 사망하였습니다.");
			this.hp = 0;
		}
	}
}
