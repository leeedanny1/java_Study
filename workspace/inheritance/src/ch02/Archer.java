package ch02;

public class Archer extends Hero{

	// �θ�Ŭ������ ��������� �����ڰ� �����Ƿ� �� �����ڸ� ȣ�� ���־�� ��
	public Archer(String name, int hp) {
		super(name, hp);
	}

	public void fireArrow() {
		System.out.println("��ȭ�����");
	}

}
