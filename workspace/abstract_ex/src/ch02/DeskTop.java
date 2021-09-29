package ch02;

public class DeskTop extends Computer {

	// 추상메소드 구현
	
	@Override
	public void display() {
		System.out.println("화면이 표시됩니다.");
	}

	@Override
	public void typing() {
		System.out.println("키보드로 타이핑 합니다.");
	}
	

}
