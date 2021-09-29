package ch12;

import java.util.ArrayList;

public class ArrayListMainTest {

	public static void main(String[] args) {

		Book book1 = new Book(1, "�帣�°���ó��", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������θ����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");

		// ArrayList
		// �����
		ArrayList<Book> shoppingCart = new ArrayList<Book>();

		// �߰����1
		// ������ �߰��ϱ�(�� �ֱ�) 3�����־��
		shoppingCart.add(book1); // [0]
		shoppingCart.add(book3); // [1]
		shoppingCart.add(book5); // [2]

		// �߰����2
		// ���ϴ� idx�� ������ ����, ������ �ڷ� �и�
		shoppingCart.add(0, book4);

		
		// ȭ�� ���
		// ����� �ڵ带 ¥�� �ʾƵ� ��. ������ ����ų Ȯ���� ���δ�.
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		// ������
		int mySize = shoppingCart.size();
		System.out.println("ArrayList's Size: " + mySize);
		// Arraylist �� ũ��� 3
		// Arraylist �� index�� ������ 0~2

		
		// ����
		// ��������
		shoppingCart.remove(3);

		System.out.println("------------");

		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}

		System.out.println("====================");

		
		// �����ϱ� set
		shoppingCart.set(1, book4);
		for (Book book : shoppingCart) {
			book.showInfo();
		}

		
		
		// CRUD
		// Create, Read, Update, Delete
		
		
	}

}