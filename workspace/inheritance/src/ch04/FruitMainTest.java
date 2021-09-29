package ch04;

import java.util.Iterator;

public class FruitMainTest {

	public static void main(String[] args) {

		Peach peach = new Peach();
		Banana banana = new Banana();
		
		peach.showInfo();
		banana.showInfo();
		
		

//		������
//		Ŭ������ �پ��� ���·� �ٶ󺻴�.
//		
//		ex) ��
//		��ü�� ��, ������ ��, ��ۼ����� ��..
//		
//		�������̶� �ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ� ��
//		���� �ڵ忡�� ���� �ٸ� ���� ����� ���� ���� �ִ�.
//		��������, ��Ӱ� ���Ҿ� ��ü���� ���α׷����� ���� ū Ư¡ �� �ϳ��̴�. 
//		�������� �� Ȱ���ϸ� �����ϰ� Ȯ�强�ְ�, ���������� ������ ���α׷��� ���� �� �ִ�.		

		
		System.out.println("--------------------------");
		
		Fruit[] basket = new Fruit[4];
		basket[0] = new Banana();
		basket[1] = new Peach();
		basket[2] = new Peach();
		basket[3] = new Peach();
		
		System.out.println(banana.origin); //?
		// .�����ڸ� ����ϰ� �Ǹ� ��ü�� Ÿ�Ա����� Ȯ���� �� �ִ�.
		// BananaŬ������ origin��� ������ �����ϱ� ���ؼ��� �ٿ� ĳ������ �ؾ��Ѵ�.
		String temp = ((Banana)basket[0]).origin;
		
		// instanceof ������
		if(basket[0] instanceof Banana) {
			System.out.println("�ٳ��� Ÿ�� �Դϴ�.");
		} else {System.out.println("������ Ÿ�� �Դϴ�.");			
		}
		if(basket[1] instanceof Peach) {
			System.out.println("������ Ÿ�� �Դϴ�.");
		}else {
			System.out.println("�ٳ��� Ÿ�� �Դϴ�.");
		}
		
		//for���� ����� �ٳ��� Ÿ���� ��� ȭ�鿡 origin ���� ��� �� ������
		for (int i = 0; i < basket.length; i++) {
			if(basket[i] instanceof Banana) {
				System.out.println(banana.origin);
			}
		}
		

	}

}