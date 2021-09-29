package ch02;

// 추상 메소드를 하나 포함하고 있기 때문에 추상 클래스가 되어야만 함.
public abstract class NoteBook extends Computer{

	@Override
	public void typing() {
		System.out.println("노트북 키보드로 타이핑 합니다.");
	}

	
	
	
}
