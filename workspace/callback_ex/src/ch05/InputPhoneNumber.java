package ch05;

// �̸��� �Է¹ް� ����ϴ� �޼ҵ带 ���� Ŭ����

import java.util.ArrayList;
import java.util.Scanner;

public class InputPhoneNumber {

	// String Ÿ���� �����ϴ� ArrayList
	private ArrayList<String> userName = new ArrayList<>();
	private ArrayList<String> tellNumber = new ArrayList<>();
	
	// g,setter
	public ArrayList<String> getUserName() {
		return userName;
	}
	public void setUserName(ArrayList<String> userName) {
		this.userName = userName;
	}
	public ArrayList<String> getTellNumber() {
		return tellNumber;
	}
	public void setTellNumber(ArrayList<String> tellNumber) {
		this.tellNumber = tellNumber;
	}
	
	// ���� �Է¹޴� �޼ҵ�
	public void savePhoneNumber() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		String number = "";
		
		// do while�� �̿��ؼ� -1 �Է¹����� ���� �ݺ�
		do {
			System.out.println("�����Ϸ��� -1�� �Է��ϼ���.");		
			System.out.print("***** �̸��� �Է��ϼ��� *****\n");
			name = sc.next();
			if(!name.equals("-1")) {
				System.out.print("***** ��ȭ��ȣ�� �Է��ϼ��� *****\n");
				number = sc.next();
				
				userName.add(name);
				tellNumber.add(number);
			}
		} while(!(name.equals("-1")));
	} //end of method
	
//	// �������� �޼ҵ�
//	public void showInfo() {
//		System.out.println("-----------------------");
//		for (int i = 0; i < userName.size(); i++) {
//			System.out.print("[" + userName.get(i) + "]: \t");
//			System.out.println(tellNumber.get(i));
//		} // end of for
//		System.out.println("-----------------------");
//	} // end of method
//	
//	
//	// main
//	public static void main(String[] args) {
//		InputPhoneNumber inputPhoneNumber = new InputPhoneNumber();
//		inputPhoneNumber.savePhoneNumber();
//		inputPhoneNumber.showInfo();
//	}
	
	
	
	
}













