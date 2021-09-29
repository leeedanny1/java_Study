package ch02;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

// ȣ����(�ݸ�)
public class Activity2 extends JFrame {
	
	String name;
	JPanel panel;
	
	CallBackcheckPosition callBackcheckPosition;
	
	public void setCallbackCheckPosition(CallBackcheckPosition callBackCheckPosition) {
		this.callBackcheckPosition = callBackCheckPosition;
	}
	
	public Activity2(String name) {
		this.name = name;
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle(name);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		
	}

	private void setInitLayout() {
		setVisible(true);
		add(panel);
		panel.setBackground(Color.yellow);
		
	}
	
	
	private void addEventListener() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				callBackcheckPosition.checkPosition(x, y);
			}
		});
	}
	

}
