package ch10;

public class MainTest1 {

	public static void main(String[] args) {

		//질럿생성
		Zealot zealot1 = new Zealot("zealot1");
		Zealot zealot2 = new Zealot("zealot2");
		Zealot zealot3 = new Zealot("zealot3");
		
		//마린생성
		Marine marine1 = new Marine("marine1");
		Marine marine2 = new Marine("marine2");
		
		//저글링생성
		Zergling zergling1 = new Zergling("zergling1");
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();
		
		System.out.println();

		///// 게임시작 /////
		System.out.println("-----게임시작-----");
		
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine2);
		zealot2.attackZergling(zergling1);
		zealot3.attackMarine(marine1);
		
		marine1.attackZealot(zealot1);
		marine1.attackZergling(zergling1);
		marine2.attackZealot(zealot3);
		
		zergling1.attackMarine(marine2);
		zergling1.attackZealot(zealot2);
		zergling1.attackMarine(marine1);
		zergling1.attackZealot(zealot1);
		
		System.out.println();
		System.out.println("-----경기종료-----");
		System.out.println();
		
		zealot1.showInfo();
		zealot2.showInfo();
		zealot3.showInfo();
		
		marine1.showInfo();
		marine2.showInfo();
		
		zergling1.showInfo();
		
		System.out.println();
		System.out.println("캐릭터 죽여보기");
		System.out.println();
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		marine1.showInfo();
		zealot1.attackMarine(marine1);
		marine1.showInfo();
		
		System.out.println();
		System.out.println("=====메소드 오버로딩으로 공격하기=====");
		System.out.println();
		
		zealot1.attack(marine2);
		zergling1.attack(zealot3);
		marine2.attack(zergling1);
		
		// print메소드도 다 오버로딩 된 거임.
		System.out.println("안녕하세요");
		System.out.println(1);
		System.out.println(0.1);
		System.out.println('a');

	}

}
