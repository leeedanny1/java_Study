package ch10;

public class MainTest1 {

	public static void main(String[] args) {

		//��������
		Zealot zealot1 = new Zealot("zealot1");
		Zealot zealot2 = new Zealot("zealot2");
		Zealot zealot3 = new Zealot("zealot3");
		
		//��������
		Marine marine1 = new Marine("marine1");
		Marine marine2 = new Marine("marine2");
		
		//���۸�����
		Zergling zergling1 = new Zergling("zergling1");
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();
		
		System.out.println();

		///// ���ӽ��� /////
		System.out.println("-----���ӽ���-----");
		
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
		System.out.println("-----�������-----");
		System.out.println();
		
		zealot1.showInfo();
		zealot2.showInfo();
		zealot3.showInfo();
		
		marine1.showInfo();
		marine2.showInfo();
		
		zergling1.showInfo();
		
		System.out.println();
		System.out.println("ĳ���� �׿�����");
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
		System.out.println("=====�޼ҵ� �����ε����� �����ϱ�=====");
		System.out.println();
		
		zealot1.attack(marine2);
		zergling1.attack(zealot3);
		marine2.attack(zergling1);
		
		// print�޼ҵ嵵 �� �����ε� �� ����.
		System.out.println("�ȳ��ϼ���");
		System.out.println(1);
		System.out.println(0.1);
		System.out.println('a');

	}

}