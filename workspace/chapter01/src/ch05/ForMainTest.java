package ch05;

//05-01. �ݺ���
public class ForMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ݺ���
		/*
		for(�ʱ�ȭ��; ���ǽ�; ������){
			���๮;
		}
		*/
		
		
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			System.out.println("����i�� ��: " + i);
			sum += i;
		}
		System.out.println("���� �����: " + sum);

	}

}
