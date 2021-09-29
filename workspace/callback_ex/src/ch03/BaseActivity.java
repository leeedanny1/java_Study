package ch03;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseActivity extends JFrame {

	// ¼±¾ð
	String name;
	JPanel panel;

	public BaseActivity(String name) {
		this.name = name;
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle(name);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
	}

	protected void setInitLayout() {
		setVisible(true);
		add(panel);
//		panel.setBackground(Color.yellow);
	}

}
