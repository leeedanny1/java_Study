package ch05;

//05-05. continue
public class ContinueTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		����� continue
//		�����ϰ� �����ϴ� continue
		
		int num, count = 0;
		final int MAX = 1000, MULTIPLE = 7;
		
		for(num = 1; num<=MAX; num++) {
			//3�� ����ΰ��
			if(num%MULTIPLE ==0) {
				count++;	//count�� 1�ø���
				continue; 	//������ �����ϰ� for������ ���ư���
			}
			System.out.println("��°�: " + num);		
		}
		System.out.println(MULTIPLE + "�� ����� ������ " + count + "�� �Դϴ�.");

	}

}
