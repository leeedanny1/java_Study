package ch09;

public class MainTest1 {

	public static void main(String[] args) {

		//static -> ��ü ������ ��� ���� �̸� �Ҵ� �Ǿ� �ִ�.
		System.out.println(NumberPrinter.waitNumber);
		
		//1�����
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		//2�����
		NumberPrinter numberPrinter2 = new NumberPrinter(2);


		//1�����
		//1. ��ȣǥ�� ����
		numberPrinter1.printWaitNumber();
		//2. ...
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		
		//2�����
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		

	}

}