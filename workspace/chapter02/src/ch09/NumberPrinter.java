package ch09;

public class NumberPrinter {

	private int id;
	// static은 메모리내용 통합함
	/*private*/ static int waitNumber; //대기번호
	
	
	public NumberPrinter(int id) {
		this.id=id;
		waitNumber = 1;
	}
	
	// 번호표를 찍어주세요
	public void printWaitNumber() {
		System.out.println(id + "번 기기의 대기 순번: " + waitNumber);
		waitNumber++;
	}
	
	
	
}
