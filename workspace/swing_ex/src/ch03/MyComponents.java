package ch03;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyComponents extends JFrame{
	
	private JPanel panel;
	private JButton button;
	private JLabel label;
	JTextField textField;
	private JPasswordField pwField;
	private JCheckBox checkBox;
	
	public MyComponents() {
		initData();
		setInitLayout();
	}

	
	
	private void initData() {
		setTitle("������Ʈ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		panel = new JPanel();
		button = new JButton("BUTTON");
		label = new JLabel("�ȳ��ϼ���");
		textField = new JTextField("", 20);
		pwField = new JPasswordField(20);
		checkBox = new JCheckBox("�����մϴ�.", true);
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		panel.setBackground(Color.yellow);
		
		this.add(panel);
		panel.add(button);
		panel.add(label);
		panel.add(textField);
		panel.add(pwField);
		panel.add(checkBox);
		
	}
}
