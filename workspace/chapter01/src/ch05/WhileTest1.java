package ch05;

//05-02. while반복문
public class WhileTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//while 반복문
		
		int num = 1;
		
		while(num < 100) {
			System.out.println("현재값: " + num);
			num++;
			//스레드는 나중에 배울거임
			//1000밀리초 == 1초
			Thread.sleep(50);
		}
		
		
	}

}
