package ch11;

import java.util.Iterator;

public class ArrayMainTest {

	public static void main(String[] args) {

		/*
		�迭
		: ������ �����͸� ��Ƽ� ������ �����ϱ� ���� ����ϴ� ������ Ÿ���̴�.
		������ �ϳ��� �����͸� �����ϱ� ���� ���̶�� �迭�� �������� �����͸� �ϳ��� ������ �����ϱ� ���� ���̶�� �� �� �ִ�.
		*/
		
		// �Ϲ� ����
		int number = 10;
		
		
		// �迭 ���� ���
		// ù ��° ��� ���� �����
		int[] arr1 = new int[3];
		int arr2[] = new int[10];
		
		// �ʱ�ȭ �ϴ� ���
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		
		// �迭 ����� ���ÿ� �ʱ�ȭ�ϱ�
		int[] numbers1 = new int[] {11, 20, 30};
		int[] numbers2 = {10, 50, 100};
		
		// ��� ���
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		
		
		// String �迭 ���� ���
		String[] strArr = new String[10];
		
		// �ʱ�ȭ
		strArr[0] = "�߽���";
		strArr[1] = "Ƽ��";
		strArr[2] = "�ֽ�";
		strArr[3] = "�ٸ��콺";
		
		// strArr �� ���
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		
		// ��� ���α׷� ���� index�� 0���� ������!!!!
		
		
		// �迭�� ����� �� ���� for���� �����ؼ� ���� �����
		System.out.println(strArr.length);
		// System.out.println(strArr[10]); 
		// index�� ũ��� n-1��
		
		for (int i = 0; i < strArr.length; i++) {
			if(strArr[i] != null) {
				System.out.println(strArr[i]);
			}
		}	
		
		
	}

}