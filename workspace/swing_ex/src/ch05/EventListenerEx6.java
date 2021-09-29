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
		setTitle("어댑터 클래스 이용 방법");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		
	}
	private void setInitLayout() {
		setVisible(true);
		
		
	}
	private void addEventListener() {
		this.addMouseListener(new MyMouseListener());
	}
	
	// 내부클래스
	private class MyMouseListener extends MouseAdapter {
		
		// MouseAdapter 에 있는 메소드를 재정의함
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("X좌표: " + x + ", Y좌표: " + y);
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("마우스가 root Container 안으로 들어왔습니다.");
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("마우스가 나갔습니다.");
		}
		
	}
	
		
}


public class EventListenerEx6 {

	public static void main(String[] args) {
		

	}

}
