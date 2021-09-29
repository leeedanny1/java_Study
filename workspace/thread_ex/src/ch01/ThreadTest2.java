package ch01;

// ������� �۾����̴�.
class MyThreadEx2 extends Thread{
	
	String name;
	
	public MyThreadEx2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		int i;
		for(i = 0; i<10; i++) {
			System.out.println(name + ": " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}


public class ThreadTest2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		System.out.println("���� ������ ����");
		MyThreadEx2 th1 = new MyThreadEx2("�۾���1");
		MyThreadEx2 th2 = new MyThreadEx2("�۾���2");
		MyThreadEx2 th3 = new MyThreadEx2("�۾���3");
		MyThreadEx2 th4 = new MyThreadEx2("�۾���4");
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		System.out.println("���� ������ ����");

	}

}
