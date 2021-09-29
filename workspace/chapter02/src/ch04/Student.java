package ch04;

public class Student {

	String name;
	int money;
	int count = 0;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 학생 정보(잔액)보기
	public void showInfo() {
		System.out.println(name + " 님의 남은 돈은: " + money);		
		System.out.println(name + " 님의 대중교통 이용 횟수는 " + count + "번 입니다.");
	}
	
	// 학생이 버스를 탄다.
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
		count ++;
	}
	// 학생이 지하철을 탄다.
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
		count ++;
	}
}
