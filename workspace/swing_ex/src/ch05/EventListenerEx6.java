package ch05;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

class MyFrame6 extends JFrame{
	
	public MyFrame6() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("����� Ŭ���� �̿� ���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		
	}
	private void setInitLayout() {
		setVisible(true);
		
		
	}
	private void addEventListener() {
		this.addMouseListener(new MyMouseListener());
	}
	
	// ����Ŭ����
	private class MyMouseListener extends MouseAdapter {
		
		// MouseAdapter �� �ִ� �޼ҵ带 ��������
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("X��ǥ: " + x + ", Y��ǥ: " + y);
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("���콺�� root Container ������ ���Խ��ϴ�.");
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("���콺�� �������ϴ�.");
		}
		
	}
	
		
}


public class EventListenerEx6 {

	public static void main(String[] args) {
		

	}

}
