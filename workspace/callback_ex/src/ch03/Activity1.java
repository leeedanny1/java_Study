package ch03;

import java.awt.Color;

public class Activity1 extends BaseActivity {

	// ����� ���ÿ� �ʱ�ȭ
	CallBackCheckPosition callBackCheckPosition = new CallBackCheckPosition() {
		
		@Override
		public void checkPosition(int x, int y) {
			System.out.println("x: " + x);
			System.out.println("y: " + y);
		}
	};
	
	// �θ�Ŭ������ ������
	public Activity1(String name) {
		super(name);
	}
	
	// setInitLayout ������
	protected void setInitLayout() {
		super.setInitLayout();
		panel.setBackground(Color.blue);
	}

}
