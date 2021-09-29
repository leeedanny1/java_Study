package ch02;

public class MainTest {

	public static void main(String[] args) {

		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		
		televison.turnOn();
		televison.turnOff();
		System.out.println("------------------");
		refrigerator.turnOn();
		refrigerator.turnOff();
		System.out.println("------------------");
		toyRobot.turnOn();
		toyRobot.turnOff();
		
		System.out.println("------------------");
		System.out.println("------------------");
		
		// 다형성 - 배(선박, 신체, 과일)
		// 배열 만들어서 크기는 3개 0, 1, 2 인스턴스 변수 넣어라.
		RemoteController[] remote = new RemoteController[3];
		remote[0] = televison;
		remote[1] = refrigerator;
		remote[2] = toyRobot;
		
		// 문제1. 확장 for문 이용해서 turnOn()메서드 호출
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		System.out.println("------------------------");
		
		// 문제2. 확장 for문 이용해서 turnOff()메서드 호출
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("-------------------------");
		
		// 문제3. for문을 이용해서 클래스 타입이 ToyRobot이면 name을 화면에 출력
		for (int i = 0; i < remote.length; i++) {
			if(remote[i] instanceof ToyRobot) {
				String name = ((ToyRobot)remote[i]).name;
				System.out.println(name);
			}
		}
		
		
		// 요구사항 추가!!!! -- 인터페이스 추가 요청
		// 냉장고의 문이 열리면 멜로디 소리가 나게 하라.
		// 장난감로봇의 건전지가 거의 없으면, 멜로디가 나게 하라.
		

	}

}
