package ch07;

public class BankMainTest {

	public static void main(String[] args) {

		Bank bank = new Bank();
		
		bank.deposit(10000);
		bank.showInfo();
		bank.withdraw(5000);
		bank.showInfo();
		
		// 신입 개발자가 실수로 멤버 변수에 바로 접근해서 잔액을 수정
//		bank.balance = 1000000;
//		bank.showInfo();
		// 접근 지정자를 이용하면 바로 접근하지 못하게 설정 할 수 있음
		
		
		
		/*
		접근제어지시자
		4가지
		* public: 누구나 접근을 허용한다.
		* default: 같은 패키지 내에서 접근 가능
		* protected: 상속관계에서 접근 허용
		* private: 같은 클래스 내에서만 접근 가능
		
		*/
	}

}
