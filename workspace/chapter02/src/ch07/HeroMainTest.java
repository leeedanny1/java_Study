package ch07;

public class HeroMainTest {

	public static void main(String[] args) {

		Hero hero = new Hero("질럿", 100, 10);
		
		// 데이터 읽기(getter)
		String name = hero.getName();
		System.out.println(name);
		
		int hp = hero.getHp();
		System.out.println(hp);
		
		int power = hero.getPower();
		System.out.println(power);
		
		
		// 데이터 변경(setter)
		hero.setName("프로브");
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
