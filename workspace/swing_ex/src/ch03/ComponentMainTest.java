package ch03;

import java.util.Scanner;

public class ComponentMainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("글자를 입력 하세요: ");
		
		String userInput = sc.next();
		System.out.println(userInput);
		
		// 메모리 온~
		MyComponents address = new MyComponents();
		address.textField.setText(userInput);

	}

}
