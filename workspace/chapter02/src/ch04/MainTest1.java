package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		Bus bus1 = new Bus(1);
		Bus bus2 = new Bus(2);
		Bus bus3 = new Bus(3);
		Bus bus4 = new Bus(4);
		
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);
		
		Student student1 = new Student("티모", 10000);
		Student student2 = new Student("홍길동", 30000);
		Student student3 = new Student("이순신", 9000);
		
		
		
		// 학생별 대중교통 이용하기
		student1.takeBus(bus1);
		student1.takeSubway(subway1);
		
		student2.takeBus(bus2);
		student2.takeBus(bus1);
		student2.takeSubway(subway3);
		student2.takeBus(bus3);
		student2.takeSubway(subway2);
		
		student3.takeSubway(subway2);
		student3.takeSubway(subway1);
		student3.takeBus(bus4);
		student3.takeBus(bus3);
		
		
		// 학생의 잔액, 버스의 정보, 지하철의 정보
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		
		bus1.showInfo();
		bus2.showInfo();
		bus3.showInfo();
		bus4.showInfo();
		
		subway1.showInfo();
		subway2.showInfo();
		subway3.showInfo();
		
		// 객체와 객체 사이의 상호작용에 의해서 프로그래밍을 할 수 있다.
		
	}

}
