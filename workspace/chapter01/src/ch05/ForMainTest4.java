package ch05;

public class ForMainTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//피라미드 만들기
		
		int num=9;
		
		for(int i=0; i<num; i++ ) {
			for(int j=num; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=i; k<num; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
