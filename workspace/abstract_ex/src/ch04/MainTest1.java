package ch04;

public class MainTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("����1");
		Zergling zergling1 = new Zergling("���۸�1");
		Marine marine1 = new Marine("����1");
		
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);

		marine1.showInfo();
		

	}

}
