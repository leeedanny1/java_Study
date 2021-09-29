package ch10;

public class Zergling {

	// ĳ���� �̸�, ���ݷ�, ü��
	private String name;
	private int power;
	private int hp;

	// ������
	// ���ݷ�5, ü��100
	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}

	// getter
	// this��� ������ �ڵ� ��Ÿ�ϸ��� ���� �ۼ� �� ��
	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}

	public int getHp() {
		return this.hp;
	}

	// �޼ҵ�
	public void showInfo() {
		System.out.println("=====" + this.name + "�� ����â=====");
		System.out.println("�̸�: " + this.name);
		System.out.println("���ݷ�: " + this.power);
		System.out.println("ü��: " + this.hp);
		System.out.println("=============");
	}
	
	// ������ �����մϴ�.
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + "�� " + zealot.getName() + "�� �����մϴ�.");
		zealot.beAttacked(this.power);
	}
	
	// ������ ����
	public void attackMarine(Marine marine) {
		System.out.println(this.name + "�� " + marine.getName() + "�� �����մϴ�.");
		marine.beAttacked(this.power);
	}
	
	
	// ===== �޼ҵ� �����ε��� �̿��� ���ô�. =====
	public void attack(Zealot zealot) {
		System.out.println(this.name + "�� " + zealot.getName() + "�� �����մϴ�.");
		zealot.beAttacked(this.power);
	}
	
	public void attack(Marine marine) {
		System.out.println(this.name + "�� " + marine.getName() + "�� �����մϴ�.");
		marine.beAttacked(this.power);		
	}
	
	// ���۸��� ������ �޽��ϴ�.
	public void beAttacked(int power) {
		this.hp -= power;
		if(this.hp <=0) {
			System.out.println(this.name + "�� ����Ͽ����ϴ�.");
			this.hp = 0;
		}
	}

}