package ch03;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Activity2 extends BaseActivity {

	CallBackCheckPosition callBackCheckPosition;

	public void setCallBackCheckPosition(CallBackCheckPosition callBackCheckPosition) {
		this.callBackCheckPosition = callBackCheckPosition;
	}

	// �θ�Ŭ������ ������
	public Activity2(String name) {
		super(name);
	}

	// �̺�Ʈ������
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

	// ������
	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		panel.setBackground(Color.yellow);
	}

}
