package ch05;

//05-03. do while반복문
public class DoWhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// do ~ while 문
		//do문을 무조건 한 번 실행하고 while 비교하며 실행문 수행
		
		int input = 10;
		int sum = 0;
		final int LIMIT = 10;
		
		do {
			System.out.println("현재값: " + input);
			//input--;
		}
		while(input != LIMIT);
	}

}
