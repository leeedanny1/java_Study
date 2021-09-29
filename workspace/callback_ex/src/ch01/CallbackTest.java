package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 인터페이스를 만들어보자
interface CallbackBtnAction{
	// abstract 생략 가능
	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	
	// 매개변수로 값 전달(기본데이터타입, object)
	public void passValue(int value);
	
}



// 콜백받는객체: CallbackBtnAction 인터페이스를 구현해서 메소드를 사용한다.
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

	// clalbackBtn 인터페이스
	@Override
	public void clickedAddBtn() {
		System.out.println(" + 버튼을 콜백 받았습니다.");
		count++;
		label.setText(count + "");
		
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println(" - 버튼을 콜백 받았습니다.");
		count--;
		label.setText(count + "");
		
	}

	@Override
	public void passValue(int value) {
		label.setText("매개변수로 값 전달 받음: " + value);
	}
	
}


// 콜리(호출자): 콜백 받는 객체의 주소값을 알고 있어야 어떠한 동작이 실행되었다고 알릴 수 있다.
class SubActibity extends JFrame implements ActionListener{
	
	JButton btnAdd;
	JButton btnMinus;
	JButton btnPassValue;

	CallbackBtnAction callbackBtnAction;
	
	public SubActibity(CallbackBtnAction callbackBtnAction) {
		this.callbackBtnAction = callbackBtnAction;
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("빼기 버튼");
		btnPassValue = new JButton("값 전달하기");

		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		add(btnAdd);
		add(btnMinus);
		add(btnPassValue);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnPassValue.addActionListener(this);
	}

	
	// 액션리스너
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource();
		if(targetBtn.getText().equals(btnAdd.getText())) {
			// 우리가 정의한 메서드 호출
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
