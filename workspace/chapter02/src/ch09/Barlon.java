package ch09;

public class Barlon {

	//1. �����ڸ� private���� �����.
	private Barlon() {}
	
	//2. static ������ Ȱ���ؼ� ���ο��� ��ü�� �����Ѵ�.
	private static Barlon instance = new Barlon();
	
	//3. �ܺο��� ������ �ν��Ͻ�(��ü)�� ������ �� �ִ� public �޼��带 ����
	public static Barlon getInstance() {
		if(instance == null) {
			instance = new Barlon();
		}
		return instance;
	}
	
	
	// main
	public static void main(String[] args) {
		Barlon barlon = Barlon.getInstance();
		System.out.println(barlon);
	}
	
}