package ch05;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame7 extends JFrame implements KeyListener {
	
	private JTextArea area;
	
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("Ű �̺�Ʈ ����");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		area = new JTextArea();		
	}

	private void setInitLayout() {
		setVisible(true);
		add(area);
	}

	private void addEventListener() {
		area.addKeyListener(this);		
	}

	
	private void display(KeyEvent e) {
		int keyCode = e.getKeyCode();
		area.append("keyCode: " + keyCode + "\n");
	}
	
	
	// ���ڸ� ������ �� ȣ��, ����Ű���� ����
	@Override
	public void keyTyped(KeyEvent e) {
		display(e);
	}
	
	// Ű���带 ������ ��, ��� Ű�� ����
	@Override
	public void keyPressed(KeyEvent e) {
		display(e);
		
//		char c = e.getKeyChar();
//		int keyCode = e.getKeyCode();
//		
//		System.out.println("C: " + c);
//		System.out.println("keyCode: " + keyCode);
//		
//		// area.setText(keyCode + "");
//		area.append("\n" + keyCode);
	}
	
	// Ű���带 ���� �� ȣ��, ��� Ű�� ����
	@Override
	public void keyReleased(KeyEvent e) {
		display(e);		
	}
	
	
	
}





public class EventListenerEx7 {

	public static void main(String[] args) {
		
		new MyFrame7();

	}

}
