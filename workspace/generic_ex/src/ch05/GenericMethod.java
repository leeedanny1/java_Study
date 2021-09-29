package ch05;

public class GenericMethod {

	// �Լ� ����� 1
	public static <X, Y> int makeRectangle1(Point<X, Y> p1, Point<X, Y> p2) {
		// �簢�� ���� ���ϴ� ���� (���� * ����)
		int left = (Integer)p1.getX();
		int right = (Integer)p2.getX();

		int top = (Integer)p1.getY();
		int bottom = (Integer)p2.getY();
		
		// ��ǥ���� ���� ����� ���� ũ�� ���� �� ����.
		int width = right - left;
		int height = bottom - top;
		
		return width * height;
	}
	
	
	// �Լ� ����� 2
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

		// ��ǥ ����
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
		
		
		// �ﰢ��
		Point<Integer, Integer> t1 = new Point<Integer, Integer>(0, 0);
		Point<Integer, Integer> t2 = new Point<Integer, Integer>(10, 10);
		Point<Integer, Integer> t3 = new Point<Integer, Integer>(10, 20);
		
		
		
		
		

	}

}
