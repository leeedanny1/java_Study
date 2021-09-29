package ch05;

// 값으로 X와 Y를 사용
public class Point<X, Y>{
	
	private X x;
	private Y y;
	
	// 생성자
	public Point(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	// getter
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
	
	
	
	
	

}
