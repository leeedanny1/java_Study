package ch01;

public class ThreadTest1 {

	// 메인쓰레드
	public static void main(String[] args) {

		for (int i = 0; i < 30; i++) {
			System.out.print("-");
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
