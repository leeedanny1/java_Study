package ch05;

//05-02. while반복문
public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1부터 10까지의 합 출력
		int num = 1;
		int sum = 0;
		final int LIMIT_VALUE = 10;
		
		while(num <= LIMIT_VALUE) {
			sum+=num;
			num++;
		}
		System.out.println(sum);
	}

}
