package ch09;

public class MainTest1 {

	public static void main(String[] args) {

		//static -> 객체 생성과 상관 없이 미리 할당 되어 있다.
		System.out.println(NumberPrinter.waitNumber);
		
		//1번기계
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		//2번기계
		NumberPrinter numberPrinter2 = new NumberPrinter(2);


		//1번기계
		//1. 번호표를 뽑음
		numberPrinter1.printWaitNumber();
		//2. ...
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		
		//2번기계
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		

	}

}
