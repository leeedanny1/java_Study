package ch05;

//05-02. while�ݺ���
public class WhileTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//while �ݺ���
		
		int num = 1;
		
		while(num < 100) {
			System.out.println("���簪: " + num);
			num++;
			//������� ���߿� ������
			//1000�и��� == 1��
			Thread.sleep(50);
		}
		
		
	}

}