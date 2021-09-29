package ch04;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel{
	
	private Image image;
	
	public ImagePanel() {
		image = new ImageIcon("image1.jpg").getImage();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
}

class MyFrame extends JFrame{
	
	ImagePanel imagePanel;
	
	public MyFrame() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("이미지 패널 연습");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}
	
}



public class MainTest1 {

	public static void main(String[] args) {
		new MyFrame();

	}

}
