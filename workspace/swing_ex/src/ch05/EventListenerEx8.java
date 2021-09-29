package ch05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame8 extends JFrame {
	
	// keyAdapter 내부 클래스로 정의해서 만들어봐라
	
	private JTextArea area;
	
	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("내부클래스로 키 이벤트 연습");
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
			System.out.println("위쪽 방향키가 눌러졌습니다.");
		} else if(keyCode == KeyEvent.VK_DOWN) {
			System.out.println("아래쪽 방향키가 눌러졌습니다.");
		} else if(keyCode == KeyEvent.VK_LEFT) {
			System.out.println("왼쪽 방향키가 눌러졌습니다.");
		} else if(keyCode == KeyEvent.VK_RIGHT) {
			System.out.println("오른쪽 방향키가 눌러졌습니다.");
		}
	}
	
	
	// adapter 패턴을 사용한 내부클래스
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
