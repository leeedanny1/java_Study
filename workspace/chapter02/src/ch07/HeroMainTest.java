package ch07;

public class HeroMainTest {

	public static void main(String[] args) {

		Hero hero = new Hero("����", 100, 10);
		
		// ������ �б�(getter)
		String name = hero.getName();
		System.out.println(name);
		
		int hp = hero.getHp();
		System.out.println(hp);
		
		int power = hero.getPower();
		System.out.println(power);
		
		
		// ������ ����(setter)
		hero.setName("���κ�");
		hero.setHp(-10);
		hero.setPower(20);
		
		String name2 = hero.getName();
		System.out.println(name2);
		
		int hp2 = hero.getHp();
		System.out.println(hp2);
		
		int power2 = hero.getPower();
		System.out.println(power2);
	}

}