package ch01;

public class BookMainTest {

	public static void main(String[] args) {
		
		Book book1 = new Book("�÷���UI����", "���ȣ");
		Book book2 = new Book("�÷���UI����", "���ȣ");
		
		// toString �޼ҵ带 �̿��� ���ϴ� return�� ���
		System.out.println(book1);
		// �ּҰ��� ���� ���� ���� hashCode()
		System.out.println(book1.hashCode());
		
		String str = new String("test");
		System.out.println(str);
		System.out.println(str.toString());
		
		

		// --�ּҰ����� ���Ѵ�.--
		// ������ ��ü��
		if(book1 == book2) {
			System.out.println("���� ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� ��ü �Դϴ�.");
		}
		
		System.out.println("-----------------------");
		
		// equals book1 book2 ��
		if(book1.equals(book2)) {
			System.out.println("���� ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
		

	}

}
