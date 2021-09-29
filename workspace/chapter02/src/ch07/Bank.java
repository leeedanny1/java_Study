package ch07;

public class Bank {

	// 정보은닉
	// 외부에서 바로 접근하지 못하도록 함.
	private int balance;
	
	// 입금기능
	public void deposit(int money) {
		this.balance += money;
	}
	// 출금기능
	public void withdraw(int money) {
		this.balance -= money;
	}
	// 잔액 출력
	public void showInfo() {
		System.out.println("현재 잔액은 [" + this.balance + "원] 입니다.");
		
	}
}
