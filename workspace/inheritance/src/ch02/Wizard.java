package ch02;

public class Wizard extends Hero{

	// �θ�Ŭ������ ��������� �����ڰ� �����Ƿ� �� �����ڸ� ȣ�� ���־�� ��
	public Wizard(String name, int hp) {
		super(name, hp);
	}

	public void freezing() {
		System.out.println("��������");
	}

}
