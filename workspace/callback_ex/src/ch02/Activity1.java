package ch02;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity1 extends JFrame{
	
	// 선언
	String name;
	JPanel panel;
	
	// 선언과 동시에 초기화
	CallBackcheckPosition callBackcheckPosition = new CallBackcheckPosition() {
		
		@Override
		public void checkPosition(int X, int Y) {
			System.out.println("x: " + X);
			System.out.println("y: " + Y);
		}
	};
	

	public Activity1(String name) {
		this.name = name;
		initData();
		setIninLayout();
	}

	private void initData() {
		setTitle(name);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
	}

	private void setIninLayout() {
		setVisible(true);
		add(panel);
		panel.setBackground(Color.blue);
	}
	
	
}
