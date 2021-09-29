package ch00;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


// 콜리
public class SubActivity extends JFrame implements ActionListener {

	// 버튼 선언
	JButton btnAdd;
	JButton btnMinus;
	JButton btnPassValue;
	
	CallbackBtnAction callbackBtnAction;
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		this.callbackBtnAction = callbackBtnAction;
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 버튼추가
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("빼기 버튼");
		btnPassValue = new JButton("값 전달하기");
		
		// 비쥬얼
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		// 생성
		add(btnAdd);
		add(btnMinus);
		add(btnPassValue);
		
		// 액션대기
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnPassValue.addActionListener(this);
	}
	
	
	
	
	// 액션 리스너
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
