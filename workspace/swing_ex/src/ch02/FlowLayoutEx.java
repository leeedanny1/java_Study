package ch02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;
	//�迭��
	JButton[] buttons = new JButton[6];
	
	
	// ������
	public FlowLayoutEx() {
		initData();
		setInitLayout();
	}
	
	// �޼ҵ�
	private void initData() {	// ������ �ʱ�ȭ
		setTitle("Flow Layout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80));
		// for������ �ڵ� ����
//		button1 = new JButton("1");
//		button2 = new JButton("2");
//		button3 = new JButton("3");
//		button4 = new JButton("4");
//		button5 = new JButton("5");
//		button6 = new JButton("6");
		for(int i = 0; i<buttons.length; i++) {
			buttons[i] = new JButton((i+1) + "");
		}
	}
	
	
	private void setInitLayout() {	// ��ġ
		setVisible(true);
		
//		this.add(button1);
//		this.add(button2);
//		this.add(button3);
//		this.add(button4);
//		this.add(button5);
//		this.add(button6);
		for(int i = 0; i<buttons.length; i++) {
			this.add(buttons[i]);
		}
		
	}
	
	
	
	//����
	public static void main(String[] args) {
		// �Ʒ� �ΰ� ����
		// FlowLayoutEx f1 = new FlowLayoutEx
		new FlowLayoutEx();
	}
	
	
}
