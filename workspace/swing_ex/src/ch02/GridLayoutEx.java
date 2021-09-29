package ch02;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;	
	
	
	//생성자
	public GridLayoutEx() {
		initData();
		setInitLayout();
	}
	
	
	//메소드
	private void initData() {
		setTitle("GridLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		button1 = new JButton("가");
		button2 = new JButton("나");
		button3 = new JButton("다");
		button4 = new JButton("라");
		button5 = new JButton("마");
		button6 = new JButton("바");
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 3));
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		
	}
	
	
	
	// MAIN
	public static void main(String[] args) {
		new GridLayoutEx();
		
		

	}

}
