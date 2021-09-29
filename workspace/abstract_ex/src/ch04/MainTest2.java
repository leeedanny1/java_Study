package ch04;

public class MainTest2 {

	public static void main(String[] args) {
		
		GateWay gateWay = new GateWay(1);
		
		Zealot zealot1 =  gateWay.createUnit(1);
		Zealot zealot2 =  gateWay.createUnit(2);
		Zealot zealot3 =  gateWay.createUnit(3);
		
		zealot1.attack(zealot3);
		System.out.println(GateWay.zealotCount);
		
		
		

	}

}
