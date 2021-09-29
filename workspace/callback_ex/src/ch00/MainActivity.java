package ch00;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

// �ݹ޴� ��ü
public class MainActivity extends JFrame implements CallbackBtnAction {
	
	int count;
	JLabel label;
	
	
	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setSize(300, 300);
		setLayout(new FlowLayout());
		add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void clickedAddBtn() {
		System.out.println(" + ��ư�� �ݹ� �޾ҽ��ϴ�.");
		count++;
		label.setText(count + "");
		
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println(" - ��ư�� �ݹ� �޾ҽ��ϴ�.");
		count--;
		label.setText(count + "");
		
	}

	@Override
	public void passValue(int value) {
		label.setText("�Ű������� �� ���� ����: " + value);
		
	}
	
	

}
