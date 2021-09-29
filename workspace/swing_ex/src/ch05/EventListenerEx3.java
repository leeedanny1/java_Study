package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


// ��ư�� �̿��ؼ� �г��� ������ ����


class ColorChangeFrame extends JFrame implements ActionListener{
	
	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;
	JButton button1;
	JButton button2;
	
	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("�̺�Ʈ�����ʿ���3");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		borderLayout = new BorderLayout();
		
		panel1 = new JPanel();
		panel1.setBackground(Color.gray);
		// panel1�� ����� ����
		panel1.setPreferredSize(new Dimension(500, 400));
		// flowLaytout���� �ѹ��� ȣ��
		panel2 = new JPanel(new FlowLayout());
		button1 = new JButton("������");
		button2 = new JButton("�����");
		
	}
	private void setInitLayout() {
		setVisible(true);
		this.setLayout(borderLayout);
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
		
		panel2.add(button1);
		panel2.add(button2);
	}
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource();
		
		if(targetBtn.getText().equals(button1.getText())) {
			panel1.setBackground(Color.red);
		}else {
			panel1.setBackground(Color.yellow);
		}
	}	
}


public class EventListenerEx3 {

	public static void main(String[] args) {
		
		// �͸� Ŭ����, �ν��Ͻ� ������ ���� ������ ���������� �����ؼ� ����� �� ����.
		new ColorChangeFrame();

	}

}
