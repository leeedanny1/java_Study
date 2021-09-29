package ch04;

public class GateWay {
	
	public static int zealotCount;
	
	private int gateWayId;
	private String name;
	
	public GateWay(int id) {
		this.gateWayId = id;
		name = "게이트웨이";
	}
	
	// 메서드 리턴 타입으로 객체를 생성
	// 질럿을 생산하기
	// public 리턴타입 createUnit(){}
	public Unit createUnit(int target) {
		zealotCount++;
		System.out.println("질럿을 생산합니다.");
		if(target == 1) {
			return new Zealot("질럿 " + zealotCount);
		} else if(target == 2) {
			return new Dragon("드라군");
		} else {
			return new DarkTempler("다크템플러");
		}
	}

}
