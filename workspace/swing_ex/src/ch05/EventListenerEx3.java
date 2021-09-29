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


// 버튼을 이용해서 패널의 색깔을 변경


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
		setTitle("이벤트리스너연습3");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		borderLayout = new BorderLayout();
		
		panel1 = new JPanel();
		panel1.setBackground(Color.gray);
		// panel1의 사이즈만 지정
		panel1.setPreferredSize(new Dimension(500, 400));
		// flowLaytout까지 한번에 호출
		panel2 = new JPanel(new FlowLayout());
		button1 = new JButton("빨간색");
		button2 = new JButton("노란색");
		
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
		
		// 익명 클래스, 인스턴스 변수가 없기 때문에 지속적으로 접근해서 사용할 수 없다.
		new ColorChangeFrame();

	}

}
