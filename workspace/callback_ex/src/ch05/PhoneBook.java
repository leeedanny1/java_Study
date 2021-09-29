package ch05;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class PhoneBook extends JFrame {

	// 포함관계
	private InputPhoneNumber inputPhoneNumber;
	
	public PhoneBook() {
		inputPhoneNumber = new InputPhoneNumber();
		inputPhoneNumber.savePhoneNumber();
		
		initData();
		SetInitLayout();
	}

	private void initData() {
		setTitle("PhoneBook");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void SetInitLayout() {
		ArrayList<String> name = inputPhoneNumber.getUserName();
		ArrayList<String> tel = inputPhoneNumber.getTellNumber();
		
		// 그리드 레이아웃, 행은 name.size만큼, 열은 2개
		setLayout(new GridLayout(name.size(), 2));
		
		for (int i = 0; i < name.size(); i++) {
			JTextField field1 = new JTextField(name.get(i), 10);
			JTextField field2 = new JTextField(tel.get(i), 20);
			add(field1);
			add(field2);
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PhoneBook();
	}
	
	
}
