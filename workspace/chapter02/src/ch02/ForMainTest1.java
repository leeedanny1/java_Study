package ch02;

public class ForMainTest1 {

	public static void main(String[] args) {
		// 이중 for문 연습
		
		// 순차 증가하는 별(*)모양 만들기
				
		for(int i = 1; i<6; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("---------------------");
		
		
		// 뒤집어진 모양
		for(int i = 1; i<6; i++) {
			for(int j = i; j<6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.println("---------------------");
		
		
		// 피라미드 모양
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < (3-i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
