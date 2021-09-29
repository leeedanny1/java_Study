package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// �������̽��� ������
interface CallbackBtnAction{
	// abstract ���� ����
	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	
	// �Ű������� �� ����(�⺻������Ÿ��, object)
	public void passValue(int value);
	
}



// �ݹ�޴°�ü: CallbackBtnAction �������̽��� �����ؼ� �޼ҵ带 ����Ѵ�.
class MainActivity extends JFrame implements CallbackBtnAction{
	
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

	// clalbackBtn �������̽�
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


// �ݸ�(ȣ����): �ݹ� �޴� ��ü�� �ּҰ��� �˰� �־�� ��� ������ ����Ǿ��ٰ� �˸� �� �ִ�.
class SubActibity extends JFrame implements ActionListener{
	
	JButton btnAdd;
	JButton btnMinus;
	JButton btnPassValue;

	CallbackBtnAction callbackBtnAction;
	
	public SubActibity(CallbackBtnAction callbackBtnAction) {
		this.callbackBtnAction = callbackBtnAction;
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnPassValue = new JButton("�� �����ϱ�");

		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		add(btnAdd);
		add(btnMinus);
		add(btnPassValue);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnPassValue.addActionListener(this);
	}

	
	// �׼Ǹ�����
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource();
		if(targetBtn.getText().equals(btnAdd.getText())) {
			// �츮�� ������ �޼��� ȣ��
			this.callbackBtnAction.clickedAddBtn();
		} else if(targetBtn.getText().equals(btnMinus.getText())) {
			this.callbackBtnAction.clickedMinusBtn();
		} else {
			this.callbackBtnAction.passValue(100);
		}
		// end of if
	} // end of action
	
}





public class CallbackTest {

	public static void main(String[] args) {
		
		MainActivity mainActivity = new MainActivity();
		new SubActibity(mainActivity);

	}

}
