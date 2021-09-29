package ch05;

//05-01. 반복문
public class ForMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//반복문
		/*
		for(초기화식; 조건식; 증감식){
			실행문;
		}
		*/
		
		
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			System.out.println("현재i의 값: " + i);
			sum += i;
		}
		System.out.println("최종 결과값: " + sum);

	}

}
