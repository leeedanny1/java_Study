package ch04;

public class Student {

	String name;
	int money;
	int count = 0;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// �л� ����(�ܾ�)����
	public void showInfo() {
		System.out.println(name + " ���� ���� ����: " + money);		
		System.out.println(name + " ���� ���߱��� �̿� Ƚ���� " + count + "�� �Դϴ�.");
	}
	
	// �л��� ������ ź��.
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
		count ++;
	}
	// �л��� ����ö�� ź��.
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
		count ++;
	}
}
