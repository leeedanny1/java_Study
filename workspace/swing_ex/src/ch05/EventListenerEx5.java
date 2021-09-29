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
		setTitle("마우스 이벤트");
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
		
		//익명구현객체로...
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX() + ": X좌표값");
				System.out.println(e.getY() + ": Y좌표값");
				System.out.println(getHeight() + ": getHeight()");
				System.out.println(getWidth() + ": getWidth()");
				
				label.setLocation(e.getX(), e.getY() - label.getBounds().height);
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스를 뗐습니다.");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 버튼이 눌러졌습니다.");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스가 나갔습니다.!!!");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스가 들어왔습니다.!!!");
				
			}
			
			
		});
		
		
		
	}

	
//
//	// 클릭되었을때 실행되는 메소드
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		System.out.println(e.getX() + ": X좌표값");
//		System.out.println(e.getY() + ": Y좌표값");
//		System.out.println(getHeight() + ": getHeight()");
//		System.out.println(getWidth() + ": getWidth()");
//		
//		label.setLocation(e.getX(), e.getY() - label.getBounds().height);
//				
//	}
//
//	// 마우스가 눌러졌을때 실행되는 메소드
//	@Override
//	public void mousePressed(MouseEvent e) {
//		
//	}
//
//	// 마우스를 눌렀다가 떼는 순간 실행되는 메소드
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		
//	}
//
//	// 마우스가 들어왔을 때 실행되는 메소드
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		
//	}
//
//	// 마우스가 나갔을 때 실행되는 메소드
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
