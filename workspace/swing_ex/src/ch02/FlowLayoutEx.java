package ch02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;
	//배열로
	JButton[] buttons = new JButton[6];
	
	
	// 생성자
	public FlowLayoutEx() {
		initData();
		setInitLayout();
	}
	
	// 메소드
	private void initData() {	// 데이터 초기화
		setTitle("Flow Layout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80));
		// for문으로 코드 수정
//		button1 = new JButton("1");
//		button2 = new JButton("2");
//		button3 = new JButton("3");
//		button4 = new JButton("4");
//		button5 = new JButton("5");
//		button6 = new JButton("6");
		for(int i = 0; i<buttons.length; i++) {
			buttons[i] = new JButton((i+1) + "");
		}
	}
	
	
	private void setInitLayout() {	// 배치
		setVisible(true);
		
//		this.add(button1);
//		this.add(button2);
//		this.add(button3);
//		this.add(button4);
//		this.add(button5);
//		this.add(button6);
		for(int i = 0; i<buttons.length; i++) {
			this.add(buttons[i]);
		}
		
	}
	
	
	
	//메인
	public static void main(String[] args) {
		// 아래 두개 같음
		// FlowLayoutEx f1 = new FlowLayoutEx
		new FlowLayoutEx();
	}
	
	
}
