package ch12;

import java.util.Iterator;

public class ArrayMainTest {

	public static void main(String[] args) {

		Book book1 = new Book(1, "�帣�°���ó��", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������θ����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");

		// ����
		// �迭�� �̿��� shoppingCart�� ��ƺ��ô�.
		// 1. �迭����, ũ�⸦ 10���� ����
		Book[] shoppingCart = new Book[10];
		// 2. ������� å�� ��ٱ��Ͽ� ��ƺ�����
		shoppingCart[0] = book1;
		shoppingCart[1] = book3;
		shoppingCart[2] = book5;
		// 3. ��ٱ��Ͽ� ���� ������ ����ϼ���, �� null�� ������� ������
		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}
		System.out.println("-------------------------");
		// Ȯ��for��
		for (Book book : shoppingCart) {
			// ������ڵ�
			if(book != null) {
				book.showInfo();	
			}
		}
		
		System.out.println("-----------------------");
		
		// �ε��� [2���� ����������
		shoppingCart[2] = null;
		// Ȯ��for��
		for(Book abc : shoppingCart) {
			//������ڵ�
			if(abc != null) {
				abc.showInfo();
			}
		}

	}
}