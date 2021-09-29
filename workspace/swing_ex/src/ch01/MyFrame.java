package ch01;

// GUI, 프레임연습!!!!!

import javax.swing.JFrame;

// JFrame 상속받고 import하기!
public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("MyFrame 연습");
		setSize(800, 800);
		// 종료옵션 설정하지 않으면 계속실행되고 있어서 메모리 낭비가 됨
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	// 메인
	public static void main(String[] args) {
		new MyFrame();
	}
	
	
}
