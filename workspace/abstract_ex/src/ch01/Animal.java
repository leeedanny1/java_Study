package ch01;

// �߻�Ŭ���� �����
public abstract class Animal {
	
	// �߻�Ŭ����(abstract class)
	// ���� �ڵ� ���� �޼����� ���� �ִ� �߻� �޼���(abstract method)�� ������ Ŭ����
	
	public String name;
	
	// �Ϲ� �޼ҵ�
	public void move() {
		System.out.println("�̵��մϴ�.");
	}
	
	//�߻�޼ҵ�
	public abstract void hunt();
	
	//�����Լ�
	public static void main(String[] args) {
		// �߻� Ŭ������ �Ϲ������� ����ߴ� new Ű���带 ����ؼ� ��ü�� ���� �� ����.
		// new Animal();
	}
	
}
