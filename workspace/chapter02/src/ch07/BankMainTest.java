package ch07;

public class BankMainTest {

	public static void main(String[] args) {

		Bank bank = new Bank();
		
		bank.deposit(10000);
		bank.showInfo();
		bank.withdraw(5000);
		bank.showInfo();
		
		// ���� �����ڰ� �Ǽ��� ��� ������ �ٷ� �����ؼ� �ܾ��� ����
//		bank.balance = 1000000;
//		bank.showInfo();
		// ���� �����ڸ� �̿��ϸ� �ٷ� �������� ���ϰ� ���� �� �� ����
		
		
		
		/*
		��������������
		4����
		* public: ������ ������ ����Ѵ�.
		* default: ���� ��Ű�� ������ ���� ����
		* protected: ��Ӱ��迡�� ���� ���
		* private: ���� Ŭ���� �������� ���� ����
		
		*/
	}

}