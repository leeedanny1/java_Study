package ch07;

public class Bank {

	// ��������
	// �ܺο��� �ٷ� �������� ���ϵ��� ��.
	private int balance;
	
	// �Աݱ��
	public void deposit(int money) {
		this.balance += money;
	}
	// ��ݱ��
	public void withdraw(int money) {
		this.balance -= money;
	}
	// �ܾ� ���
	public void showInfo() {
		System.out.println("���� �ܾ��� [" + this.balance + "��] �Դϴ�.");
		
	}
}