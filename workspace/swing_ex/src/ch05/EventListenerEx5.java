package ch05;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame5 extends JFrame /*implements MouseListener*/{
	
	JLabel label;
	
	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("���콺 �̺�Ʈ");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel("Hello");
		label.setSize(150, 150);
		label.setForeground(Color.blue);
		System.out.println(label.getBounds());
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		label.setLocation(50, 50);
	}
	private void addEventListener() {
		// this.addMouseListener(this);
		
		//�͸�����ü��...
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX() + ": X��ǥ��");
				System.out.println(e.getY() + ": Y��ǥ��");
				System.out.println(getHeight() + ": getHeight()");
				System.out.println(getWidth() + ": getWidth()");
				
				label.setLocation(e.getX(), e.getY() - label.getBounds().height);
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("���콺�� �ý��ϴ�.");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("���콺 ��ư�� ���������ϴ�.");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("���콺�� �������ϴ�.!!!");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("���콺�� ���Խ��ϴ�.!!!");
				
			}
			
			
		});
		
		
		
	}

	
//
//	// Ŭ���Ǿ����� ����Ǵ� �޼ҵ�
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		System.out.println(e.getX() + ": X��ǥ��");
//		System.out.println(e.getY() + ": Y��ǥ��");
//		System.out.println(getHeight() + ": getHeight()");
//		System.out.println(getWidth() + ": getWidth()");
//		
//		label.setLocation(e.getX(), e.getY() - label.getBounds().height);
//				
//	}
//
//	// ���콺�� ���������� ����Ǵ� �޼ҵ�
//	@Override
//	public void mousePressed(MouseEvent e) {
//		
//	}
//
//	// ���콺�� �����ٰ� ���� ���� ����Ǵ� �޼ҵ�
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		
//	}
//
//	// ���콺�� ������ �� ����Ǵ� �޼ҵ�
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		
//	}
//
//	// ���콺�� ������ �� ����Ǵ� �޼ҵ�
//	@Override
//	public void mouseExited(MouseEvent e) {
//		
//	}
//	
	
}








public class EventListenerEx5 {

	public static void main(String[] args) {

		new MyFrame5();

	}

}
