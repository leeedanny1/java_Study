package ch05;

//05-03. do while�ݺ���
public class DoWhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// do ~ while ��
		//do���� ������ �� �� �����ϰ� while ���ϸ� ���๮ ����
		
		int input = 10;
		int sum = 0;
		final int LIMIT = 10;
		
		do {
			System.out.println("���簪: " + input);
			//input--;
		}
		while(input != LIMIT);
	}

}