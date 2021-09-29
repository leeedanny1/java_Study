package ch07;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrameEx1 extends JFrame {

	MyPanel myPanel;
	Lotto lotto;

	public MyFrameEx1() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("로또번호추출기");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		myPanel = new MyPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		setBackground(Color.gray);
		add(myPanel);

		setLayout(new GridLayout(1, 6));

		// 새로운 배열을 만들어서 lotto클래스의 number를 가져옴
		int[] lottoNumbers = new int[6];
		for (int i = 0; i < lotto.numbers.length; i++) {
			lottoNumbers[i] = lotto.numbers[i];
		}

	}

	// 내부클래스
	private class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			Font font = new Font("궁서체", Font.BOLD, 20);
			g.setFont(font);
			g.drawString("로또 버튼을 클릭하세요", 180, 180);
		}
	}

}

public class MainTest2 {

	public static void main(String[] args) {

		new MyFrameEx1();

	}

}
