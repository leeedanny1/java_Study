package ch05;

//05-04. break
public class BreakTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����� break
		//�߰��� ���ߴ� break

		for(int i=1; i<11; i++) {
			System.out.println(i);
			if(i%7 == 0) {
				break;
			}
		}
	}

}