package ch09;

public class NumberPrinter {

	private int id;
	// static�� �޸𸮳��� ������
	/*private*/ static int waitNumber; //����ȣ
	
	
	public NumberPrinter(int id) {
		this.id=id;
		waitNumber = 1;
	}
	
	// ��ȣǥ�� ����ּ���
	public void printWaitNumber() {
		System.out.println(id + "�� ����� ��� ����: " + waitNumber);
		waitNumber++;
	}
	
	
	
}