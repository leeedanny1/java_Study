package ch06;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MiniAmongUs extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage amongImag1;
	BufferedImage amongImag2;
	CustomJPanel customJPanel;

	int among1XPoint = 0;
	int among1YPoint = 370;
	int among2XPoint = 200;
	int among2YPoint = 200;

	public MiniAmongUs() {
		initData();
		setInitLayout();
		addEventListener();

		Thread thread = new Thread(customJPanel);
		thread.start();
	}

	private void initData() {
		setTitle("미니 어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background2.jpg"));
			amongImag1 = ImageIO.read(new File("among1.png"));
			amongImag2 = ImageIO.read(new File("among2.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("파일이 없습니다.");
		}

		customJPanel = new CustomJPanel();
	}

	private void setInitLayout() {
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();

				switch (code) {
				case KeyEvent.VK_UP:
					among2XPoint -= 10;
					break;
				case KeyEvent.VK_DOWN:
					among2XPoint += 10;
					break;
				case KeyEvent.VK_LEFT:
					among2XPoint -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					among2XPoint += 10;
					break;
				}
				repaint();

				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

	}

	private class CustomJPanel extends JPanel implements Runnable {
		@Override
		protected void paintComponent(Graphics g) {
			g.drawImage(backgroundImage, 0, 0, 600, 600, null);
			g.drawImage(amongImag1, among1XPoint, among1YPoint, 100, 100, null);
			g.drawImage(amongImag2, among2XPoint, among2YPoint, 100, 100, null);
		}

		@Override
		public void run() {
			boolean direcation = true;
			while (true) {
				if (direcation) {
					among1XPoint += 10;
				} else {
					among1XPoint -= 10;
				}

				if (among1XPoint == 400) {
					direcation = false;
				}
				if (among1XPoint == 0) {
					direcation = true;
				}

				// ------------------------충돌시 삭제-----------------------------------------------------------
				if (among1XPoint == among2XPoint && among1YPoint == among2YPoint) {
					amongImag1 = null;
				}
				
				// 범위 벗어났을 때 더 이상 안움직이게..
				

				repaint();
			} // end of while
		} // end of run method
	}//end of inner class
}

public class MainTest {

	public static void main(String[] args) {
		new MiniAmongUs();

	} // end of main

} // end of MainTest class
