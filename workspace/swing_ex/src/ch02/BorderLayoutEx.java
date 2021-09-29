package ch02;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{
	
	private BorderLayout borderLayout;
	JButton[] buttons = new JButton[5];
	String[] titles = {"북", "센터", "남", "동", "서"};
	String[] directions = {BorderLayout.NORTH, BorderLayout.CENTER, BorderLayout.SOUTH,
			BorderLayout.EAST, BorderLayout.WEST};
	
	
	
	public BorderLayoutEx() {
		initData(); // 데이터 초기화
		setInitLayout(); // 레이아웃 배치
	}


	private void initData() {
		setTitle("BorderLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		borderLayout = new BorderLayout();
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(titles[i]);
		}
	}
	
	private void setInitLayout() {
		setVisible(true);
//		add(buttons[0], BorderLayout.NORTH);
//		add(buttons[1], BorderLayout.CENTER);
//		add(buttons[2], BorderLayout.SOUTH);
//		add(buttons[3], BorderLayout.EAST);
//		add(buttons[4], BorderLayout.WEST);
		//for문으로
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], directions[i]);
		}
		
	}


	// MAIN
	public static void main(String[] args) {
		new BorderLayoutEx();
		
		

	}

}
