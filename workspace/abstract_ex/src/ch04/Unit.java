package ch04;

// newŰ���带 ����� �޸𸮿� ������ �� ����.
public abstract class Unit {

	// ����
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


	// �޼ҵ�
	// ����
	public void showInfo() {
		System.out.println("=====" + this.name + "�� ����â=====");
		System.out.println("�̸�: " + this.name);
		System.out.println("���ݷ�: " + this.power);
		System.out.println("ü��: " + this.hp);
		System.out.println("=============");
	}
	
	//�����ϱ�
	public void attack(Unit unit) {
		System.out.println(this.name + "�� " + unit.getName() + "�� �����մϴ�.");
		unit.beAttacked(this.power);		
	}
	
	//���ݴ���
	public void beAttacked(int power) {
		this.hp -= power;
		if(this.hp <=0) {
			System.out.println(this.name + "�� ����Ͽ����ϴ�.");
			this.hp = 0;
		}
	}
}
