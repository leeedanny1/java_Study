package ch03;

public class Person {
	
	// ��������
	int height, weight, age;
	String gender, name;
	
	// ������
	public Person(int height, int weight, int age, String gender, String name) {
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
		this.name = name;
	}
	
	// �޼ҵ�
	public void showInfo() {
		System.out.println("Ű�� " + height + "�̰� �����԰� " + weight + "ų���� " + gender + "�� �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴�" + age + "�� �Դϴ�.");
		
	}



	// main
	public static void main(String[] args) {
		Person p1 = new Person(180, 78, 37, "����", "Tomas");
		p1.showInfo();
	}

}