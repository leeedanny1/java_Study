package ch02;

public class Hero {

	String name;
	int hp;
	
	// ������
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	// �޼ҵ�
	public void attack() {
		System.out.println(name + "�� �⺻����");
	}
	
	
	
}
