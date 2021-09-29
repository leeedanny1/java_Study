package ch05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame4 extends JFrame{
	
	JButton button;
	
	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("�͸�����ü ��뿬��");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button = new JButton("��ư1");
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button);
	}
	private void addEventListener() {
		// �͸�����ü
		// �͸�����ü��, 1ȸ���� �������̽��� �͸� ��ü�� ���� ����� �� �ִ�.
		// ����Ŭ���� --> �͸� ���� Ŭ����
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� Ŭ����!!!");
				
			}
		});
		
		
	}
	

}







public class EventListenerEx4 {

	public static void main(String[] args) {

		new MyFrame4();

	}

}
