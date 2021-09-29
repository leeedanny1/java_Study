package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



class MyPanel extends JPanel{
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("반갑습니다", 10, 20);
		g.drawLine(20, 30, 100, 100); // 선을 긋다 x축 y축
		g.drawRect(100, 100, 150, 150);
	}
	
} // end of MyPanel



class MyFrame extends JFrame{
	MyPanel panel;
	
	public MyFrame() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("java 2D test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		panel = new MyPanel();
	}
	private void setInitLayout() {
		setVisible(true);
		add(panel);
	}
	
	//---------------------------------------
	//내부클래스
	class MyPanel extends JPanel{
		
		public void paint(Graphics g) {
			super.paint(g);
			
			g.drawRect(200, 200, 200, 200);
			g.drawLine(300, 100, 200, 200);
			g.drawLine(300, 100, 400, 200);
			
		}
	}
	
	
	
	
}



public class PanelMainTest {

	public static void main(String[] args) {
		
		new MyFrame();

	}

}
