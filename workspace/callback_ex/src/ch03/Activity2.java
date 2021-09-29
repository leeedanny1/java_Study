package ch03;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Activity2 extends BaseActivity {

	CallBackCheckPosition callBackCheckPosition;

	public void setCallBackCheckPosition(CallBackCheckPosition callBackCheckPosition) {
		this.callBackCheckPosition = callBackCheckPosition;
	}

	// 부모클래스의 생성자
	public Activity2(String name) {
		super(name);
	}

	// 이벤트리스너
	private void addEventListener() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();

				callBackCheckPosition.checkPosition(x, y);
			}
		});
	}

	// 재정의
	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		panel.setBackground(Color.yellow);
	}

}
