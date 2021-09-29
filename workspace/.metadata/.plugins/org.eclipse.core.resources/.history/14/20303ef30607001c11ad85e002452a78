package ch01;

class Cal{
	// 덧셈 메소드
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	// 곱셈 메소드
	public int multiplay(int n1, int n2) {
		return n1 * n2;
	}
	
}


class Cal2 extends Cal{
	
	public int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	// 메소드를 재정의할 수 있다.
	// 오버라이드(오버라이딩): 부모에 있는 메소드를 필요에 의해 재정의하였다.
	/*
	public int multiplay(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0을 입력하지 마시오");
		}
		return n1 * n2;
	}
	*/
	
	@Override
	public int multiplay(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0을 입력하지 마세요");
		}
		return n1 * n2;
	}
}




public class MainTest2 {

	public static void main(String[] args) {

		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 7));
		System.out.println(cal2.multiplay(10, 0));
		
		
		

	}

}
