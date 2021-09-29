package ch01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

// map �ڷᱸ��
// map �迭�� key-value ������ �����͸� �����Ѵ�.
// key���� �ߺ��� ������� �ʴ´�.
// ������ ����.

public class DataStructureTest2 {

	public static void main(String[] args) {

		Map map;
		
		// map �迭�� key-value ������ �����͸� �����Ѵ�.
		
		// HashMap
		// null ���� ���� ����.
		HashMap<String, String> map1 = new HashMap<String, String>();
		// HashTable
		// null ���� ������� �ʴ´�.
		Hashtable<String, String> map2 = new Hashtable<String, String>();
		

		// key���� �ߺ��� ������� �ʴ´�.
//		map1.put("A01", "������������");
//		map1.put("A01", "������������");
//		map1.put("A01", "������������");
//		map1.put("A01", "������������");
//		map1.put("A01", "������������");
//		map1.put("A01", "������������");
//		System.out.println(map1);
		
		System.out.println("================");
		
		map1.put("B01", "������������");
		map1.put("B02", "���������Ĺ�");
		map1.put("C01", "���ذ�������");
		map1.put("C02", "���ذ����Ĺ�");
		map1.put("D01", "��õ��������");
		map1.put("E01", null);
		
		// ȭ�鿡 ���
		System.out.println(map1);
		
		// key�� �̿��� ���ϴ� �����
		System.out.println(map1.get("C01"));
		
		// ����
		map1.remove("E01");
		System.out.println(map1);
		// ��ü����
//		map1.clear();
		System.out.println(map1);
		
		// ������ Ȯ�ι��
		System.out.println(map1.size());
		
		
		
		System.out.println("================");
		
		
		
		// for�� �����
		for(Entry<String, String> entry : map1.entrySet()) {
			System.out.println("[key] " + entry.getKey() + "\t[value] " + entry.getValue());
		}
		
		System.out.println("-------------------------------");
		
		// for each
		for (String key : map1.keySet()) {
			System.out.println(key + " : " + map1.get(key));
		}
		
		
	}

}

















