package ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	String name;
	int grade;
}


// List �ڷᱸ��
// ����(index)�� �ְ�, �ߺ����� ����Ѵ�.
// null�� ���

public class DataStructureTest3 {

	public static void main(String[] args) {
		
		List list0;
		
		// ������ �ְ�, �ߺ��� ����
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Student> members = new ArrayList<Student>();
		
		// �� �߰� ���
		list.add(3);			// idx 0
		list.add(null);		// idx 1	-> idx 2
		list.add(1, 10); 	// 1�� index�� �� 10 �߰�	-> idx 1
		System.out.println("�� �߰� Ȯ��: " + list);
		
		// �� �������
		list.remove(2);	// 2�� idx�� �� ����
//		list.clear(); 		// ��ü ����
		System.out.println("�� ���� Ȯ��: " + list);
		
		// ������ Ȯ��
		System.out.println("������ Ȯ��: " + list.size());
		
		System.out.println("========================");
		
		// �� ��¹��
		System.out.println(list.get(1));
		
		// for
		for (Integer i : list) {
			System.out.println("for ����: " + i);
		}
		
		// while
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("while������ �� Ȯ��: " + iter.next());
		}
		
		System.out.println("----------------------------");
		
		// ArrayList �� �˻�
		// �ֳ�? ����? ���θ� Ȯ��
		// ����Ʈ�ȿ� ���� �ִ��� Ȯ��, return���� T/F
		System.out.println(list.contains(1));
		System.out.println(list.contains(10));
		
		// idx�� ã��
		// ���� ������ idx��ȣ ��ȯ, ������ -1 ��ȯ
		System.out.println(list.indexOf(3));	// 3���� �����ϰ� �ִ� idx��ȣ Ȯ��
		System.out.println(list.indexOf(10));	// 10���� �����ϰ� �ִ� idx��ȣ Ȯ��
		System.out.println(list.indexOf(100));	// 100(���°�)���� �����ϰ� �ִ� idx��ȣ Ȯ��: -1 ��ȯ
		

		
		
	}

}








