package ch00;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


// �ݸ�
public class SubActivity extends JFrame implements ActionListener {

	// ��ư ����
	JButton btnAdd;
	JButton btnMinus;
	JButton btnPassValue;
	
	CallbackBtnAction callbackBtnAction;
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		this.callbackBtnAction = callbackBtnAction;
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// ��ư�߰�
		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnPassValue = new JButton("�� �����ϱ�");
		
		// �����
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		// ����
		add(btnAdd);
		add(btnMinus);
		add(btnPassValue);
		
		// �׼Ǵ��
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnPassValue.addActionListener(this);
	}
	
	
	
	
	// �׼� ������
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource();
		
		if(targetBtn.getText().equals(btnAdd.getText())) {
			this.callbackBtnAction.clickedAddBtn();
		} else if (targetBtn.getText().equals(btnMinus.getText())) {
			this.callbackBtnAction.clickedMinusBtn();			
		} else {
			this.callbackBtnAction.passValue(100);
		}
		
	}
	

}
