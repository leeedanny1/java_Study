package ch01;

// ����ó��
public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};

		
//		for(int i=0; i<10; i++) {
//			System.out.println(arr[i]);
//		}
		
		System.out.println("���Ⱑ ���� �ɱ��?");
		
		try {
			for(int i=0; i<10; i++) {
				System.out.println(arr[i]);
			}	
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("���Ⱑ ���� �ɱ��?");

	}

}

