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
		setTitle("�ζǹ�ȣ�����");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		myPanel = new MyPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		setBackground(Color.gray);
		add(myPanel);

		setLayout(new GridLayout(1, 6));

		// ���ο� �迭�� ���� lottoŬ������ number�� ������
		int[] lottoNumbers = new int[6];
		for (int i = 0; i < lotto.numbers.length; i++) {
			lottoNumbers[i] = lotto.numbers[i];
		}

	}

	// ����Ŭ����
	private class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			Font font = new Font("�ü�ü", Font.BOLD, 20);
			g.setFont(font);
			g.drawString("�ζ� ��ư�� Ŭ���ϼ���", 180, 180);
		}
	}

}

public class MainTest2 {

	public static void main(String[] args) {

		new MyFrameEx1();

	}

}
