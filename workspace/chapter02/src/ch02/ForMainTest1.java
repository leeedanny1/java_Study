package ch02;

public class ForMainTest1 {

	public static void main(String[] args) {
		// ���� for�� ����
		
		// ���� �����ϴ� ��(*)��� �����
				
		for(int i = 1; i<6; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("---------------------");
		
		
		// �������� ���
		for(int i = 1; i<6; i++) {
			for(int j = i; j<6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.println("---------------------");
		
		
		// �Ƕ�̵� ���
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < (3-i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
