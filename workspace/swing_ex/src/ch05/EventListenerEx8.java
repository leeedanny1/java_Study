package ch05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame8 extends JFrame {
	
	// keyAdapter ���� Ŭ������ �����ؼ� ��������
	
	private JTextArea area;
	
	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("����Ŭ������ Ű �̺�Ʈ ����");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		area = new JTextArea();		
	}

	private void setInitLayout() {
		setVisible(true);
		add(area);
	}

	private void addEventListener() {
		area.addKeyListener(new MyKeyboardListener());				
	}
	
	
	public void display(KeyEvent e) {
		int keyCode = e.getKeyCode();
		area.append("keyCode: " + keyCode + "\n");
		
		if(keyCode == KeyEvent.VK_UP) {
			System.out.println("���� ����Ű�� ���������ϴ�.");
		} else if(keyCode == KeyEvent.VK_DOWN) {
			System.out.println("�Ʒ��� ����Ű�� ���������ϴ�.");
		} else if(keyCode == KeyEvent.VK_LEFT) {
			System.out.println("���� ����Ű�� ���������ϴ�.");
		} else if(keyCode == KeyEvent.VK_RIGHT) {
			System.out.println("������ ����Ű�� ���������ϴ�.");
		}
	}
	
	
	// adapter ������ ����� ����Ŭ����
	private class MyKeyboardListener extends KeyAdapter{
		
		@Override
		public void keyTyped(KeyEvent e) {
			display(e);
		}
		@Override
		public void keyPressed(KeyEvent e) {
			display(e);
		}
		@Override
		public void keyReleased(KeyEvent e) {
			display(e);
		}
		
	}
		
}


public class EventListenerEx8 {

	public static void main(String[] args) {
		
		new MyFrame8();

	}

}
