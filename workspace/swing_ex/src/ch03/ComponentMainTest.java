package ch03;

import java.util.Scanner;

public class ComponentMainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է� �ϼ���: ");
		
		String userInput = sc.next();
		System.out.println(userInput);
		
		// �޸� ��~
		MyComponents address = new MyComponents();
		address.textField.setText(userInput);

	}

}
