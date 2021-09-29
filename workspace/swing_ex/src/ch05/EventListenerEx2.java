package ch05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


// 버튼을 누르면 콘솔창에 출력


class MyFrame2 extends JFrame implements ActionListener{
	
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	
	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("이벤트 리스너 연습2");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");
		button4 = new JButton("button4");
		button5 = new JButton("button5");
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
	}
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent가 일어나면 여기 메서드에서 동작됨!!!");
		
		// System.out.println(e.toString());
		JButton clickedButton = (JButton) e.getSource();
		// System.out.println(clickedButton.getText());
		
		// if문을 사용해서 
		if(clickedButton.getText().equals(button1.getText())) {
			System.out.println("1번 버튼이 클릭되었습니다.");
		} else if(clickedButton.getText().equals(button2.getText())) {
			System.out.println("2번 버튼이 클릭되었습니다.");
		} else if(clickedButton.getText().equals(button3.getText())) {
			System.out.println("3번 버튼이 클릭되었습니다.");
		} else if(clickedButton.getText().equals(button4.getText())) {
			System.out.println("4번 버튼이 클릭되었습니다.");
		} else {
			System.out.println("5번 버튼이 클릭되었습니다.");
		}
		
		
	}
	
	
	
	
}








public class EventListenerEx2 {

	public static void main(String[] args) {

		new MyFrame2();

	}

}
