package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

// set �ڷᱸ��
// set�� ������ ����, �ߺ����� ������� �ʴ´�.

public class DataStructureTest1 {

	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		set1.add(1);
		set1.add(1); // �ߺ���
		set1.add(2);
		set1.add(3);
		set1.add(3); // �ߺ���
		set1.add(3); // �ߺ���
		
		// ������ Ȯ��
		System.out.println(set1.size());
		
		System.out.println("====================");
		
		// �����ϱ�
		set1.remove(1);
		// ���빰 Ȯ��
		System.out.println(set1);
		
		System.out.println("====================");
		
		// ��ü����
//		set1.clear();
		System.out.println(set1);
		
		System.out.println("====================");
		
		// ���빰 �ִ��� ���� Ȯ��
		System.out.println(set1.isEmpty());
		
		
		System.out.println("====================");
		System.out.println("====================");
		
		
		// for�� ��� ���
		// set�� ������ ���� ������ ���� Ȯ�� �� �� ����.
		for (int i = 0; i < set1.size(); i++) {
			System.out.println("set1�� Ȯ��: " + i);
		}
		
		System.out.println("====================");
		
		// for each �����δ� ��� ����
		for (Integer integer : set1) {
			System.out.println(integer);
		}
		
		System.out.println("====================");
		
		// while�� ��� ���
		// Iterator
		// ��� ��ȸ(�ݺ���)�÷��� �����ӿ�ũ�� ����� ��Ҹ� �ϳ��� ���ʷ� �����ϴ� ��
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("�� Ȯ��: " + iter.next());
		}
		
	
		
		System.out.println("====================");
		System.out.println("====================");
		System.out.println("====================");
		
		

		HashSet<Integer> set2 = new HashSet<>();
		set2.add(getRandomNumber());
		set2.add(getRandomNumber());
		set2.add(getRandomNumber());
		set2.add(getRandomNumber());
		set2.add(getRandomNumber());
		set2.add(getRandomNumber());
		System.out.println(set2);
	}
	
	
	// ���� �޼ҵ� �ۼ�
	public static int getRandomNumber() {
		Random random = new Random();
		int value = random.nextInt(45) +1;
		return value;
	}
	
	
	
	
	

}
















