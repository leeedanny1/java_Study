package ch05;

//05-04. break
public class BreakTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//예약어 break
		//중간에 멈추는 break

		for(int i=1; i<11; i++) {
			System.out.println(i);
			if(i%7 == 0) {
				break;
			}
		}
	}

}
