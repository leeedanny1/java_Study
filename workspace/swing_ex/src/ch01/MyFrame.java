package ch01;

// GUI, �����ӿ���!!!!!

import javax.swing.JFrame;

// JFrame ��ӹް� import�ϱ�!
public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("MyFrame ����");
		setSize(800, 800);
		// ����ɼ� �������� ������ ��ӽ���ǰ� �־ �޸� ���� ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	// ����
	public static void main(String[] args) {
		new MyFrame();
	}
	
	
}
