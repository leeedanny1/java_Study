package ch03;

import java.awt.Color;

public class Activity1 extends BaseActivity {

	// 선언과 동시에 초기화
	CallBackCheckPosition callBackCheckPosition = new CallBackCheckPosition() {
		
		@Override
		public void checkPosition(int x, int y) {
			System.out.println("x: " + x);
			System.out.println("y: " + y);
		}
	};
	
	// 부모클래스의 생성자
	public Activity1(String name) {
		super(name);
	}
	
	// setInitLayout 재정의
	protected void setInitLayout() {
		super.setInitLayout();
		panel.setBackground(Color.blue);
	}

}
