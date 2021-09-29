package ch05;

// 이름을 입력받고 출력하는 메소드를 가진 클래스

import java.util.ArrayList;
import java.util.Scanner;

public class InputPhoneNumber {

	// String 타입을 저장하는 ArrayList
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
	
	// 정보 입력받는 메소드
	public void savePhoneNumber() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		String number = "";
		
		// do while문 이용해서 -1 입력받을때 까지 반복
		do {
			System.out.println("중지하려면 -1을 입력하세요.");		
			System.out.print("***** 이름을 입력하세요 *****\n");
			name = sc.next();
			if(!name.equals("-1")) {
				System.out.print("***** 전화번호를 입력하세요 *****\n");
				number = sc.next();
				
				userName.add(name);
				tellNumber.add(number);
			}
		} while(!(name.equals("-1")));
	} //end of method
	
//	// 정보보기 메소드
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













