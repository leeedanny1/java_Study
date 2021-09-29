package ch09;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 배경이 움직이는 게임 만들기

public class Play1945 extends JFrame {

	BufferedImage bgImage1;
	BufferedImage bgImage2;
	BufferedImage among;
	
	ImagePanel imagePanel;

	final int WIDTH_SIZE = 600;
	final int HEIGHT_SIZE = 600;
	int bgX1;
	int bgX2;
	int bgY1;
	int bgY2;
	int amongX;
	int amongY;

	public Play1945() {
		initData();
		setInitLayout();
		addEventListener();

		// 쓰레드 생성 3번째 방법
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
//					bgX1--;
//					bgX2--;
					bgY1++;
					bgY2++;

//					if (bgX1 < -WIDTH_SIZE) {
//						bgX1 = WIDTH_SIZE;
//					}
//
//					if (bgX2 < -WIDTH_SIZE) {
//						bgX2 = WIDTH_SIZE;
//					}
					
					if (bgY1 > HEIGHT_SIZE) {
						bgY1 = -HEIGHT_SIZE;
					}
					if (bgY2 > HEIGHT_SIZE) {
						bgY2 = -HEIGHT_SIZE;
					}
					
					repaint();
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
	}

	private void initData() {
		setSize(WIDTH_SIZE, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		try {
			bgImage1 = ImageIO.read(new File("background2.jpg"));
			bgImage2 = ImageIO.read(new File("background2.jpg"));
			among = ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			System.err.println("파일이 없습니다.");
		}

		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);

	}

	private void addEventListener() {
		// 어몽어스 캐릭터를 움직이기 위한 키 이벤트 작성
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				if(code == KeyEvent.VK_LEFT) {
					amongX -= 10;
				} else if(code == KeyEvent.VK_RIGHT) {
					amongX += 10;
				}
			}
		});
	}

	private class ImagePanel extends JPanel {

		// 이미지 기초 좌표 셋팅
		public ImagePanel() {
			bgX1 = 0;
			bgX2 = 0;
			bgY1 = 0;
			bgY2 = HEIGHT_SIZE;
			
			amongX = 250;
			amongY = 450;
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); // 캔버스를 비워주는 메소드.
			g.drawImage(bgImage1, bgX1, bgY1, WIDTH_SIZE, 600, null);
			g.drawImage(bgImage2, bgX2, bgY2, WIDTH_SIZE, 600, null);
			g.drawImage(among, amongX, amongY, 100, 100, null);
		}

	}

	public static void main(String[] args) {
		new Play1945();
	}

}
