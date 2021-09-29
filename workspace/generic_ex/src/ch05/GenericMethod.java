package ch05;

public class GenericMethod {

	// 함수 만들기 1
	public static <X, Y> int makeRectangle1(Point<X, Y> p1, Point<X, Y> p2) {
		// 사각형 넓이 구하는 공식 (가로 * 세로)
		int left = (Integer)p1.getX();
		int right = (Integer)p2.getX();

		int top = (Integer)p1.getY();
		int bottom = (Integer)p2.getY();
		
		// 좌표값을 서로 빼줘야 실제 크기 구할 수 있음.
		int width = right - left;
		int height = bottom - top;
		
		return width * height;
	}
	
	
	// 함수 만들기 2
	public static <X, Y> double makeRectangle2(Point<X, Y> p3, Point<X, Y> p4) {
		
		double left = ((Number)p3.getX()).doubleValue();
		double right = ((Number)p4.getX()).doubleValue();
		
		double top = ((Number)p3.getY()).doubleValue();
		double bottom = ((Number)p4.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;		
		
		return width * height;
	}
	
	
	
	
	public static void main(String[] args) {

		// 좌표 지정
		Point<Integer, Integer> p1 = new Point<Integer, Integer>(0, 0);
		Point<Integer, Integer> p2 = new Point<>(20, 10);  
		
		
		double size = makeRectangle1(p1, p2);
		System.out.println("size: " + size);
		
		System.out.println("-------------");

		
		Point<Integer, Double> p3 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p4 = new Point<Integer, Double>(20, 20.0);
		
		double size2 = makeRectangle2(p3, p4);
		System.out.println("sizek: " + size2);
		
		System.out.println("-------------");
		
		
		// 삼각형
		Point<Integer, Integer> t1 = new Point<Integer, Integer>(0, 0);
		Point<Integer, Integer> t2 = new Point<Integer, Integer>(10, 10);
		Point<Integer, Integer> t3 = new Point<Integer, Integer>(10, 20);
		
		
		
		
		

	}

}
