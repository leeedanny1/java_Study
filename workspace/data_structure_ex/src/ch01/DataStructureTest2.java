package ch01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

// map 자료구조
// map 계열은 key-value 구조로 데이터를 저장한다.
// key값의 중복을 허용하지 않는다.
// 순서가 없다.

public class DataStructureTest2 {

	public static void main(String[] args) {

		Map map;
		
		// map 계열은 key-value 구조로 데이터를 저장한다.
		
		// HashMap
		// null 값도 저장 가능.
		HashMap<String, String> map1 = new HashMap<String, String>();
		// HashTable
		// null 값을 허용하지 않는다.
		Hashtable<String, String> map2 = new Hashtable<String, String>();
		

		// key값의 중복을 허용하지 않는다.
//		map1.put("A01", "김포공항정문");
//		map1.put("A01", "김포공항정문");
//		map1.put("A01", "김포공항정문");
//		map1.put("A01", "김포공항정문");
//		map1.put("A01", "김포공항정문");
//		map1.put("A01", "김포공항정문");
//		System.out.println(map1);
		
		System.out.println("================");
		
		map1.put("B01", "김포공항정문");
		map1.put("B02", "김포공항후문");
		map1.put("C01", "김해공항정문");
		map1.put("C02", "김해공항후문");
		map1.put("D01", "인천공항정문");
		map1.put("E01", null);
		
		// 화면에 출력
		System.out.println(map1);
		
		// key값 이용해 원하는 값출력
		System.out.println(map1.get("C01"));
		
		// 삭제
		map1.remove("E01");
		System.out.println(map1);
		// 전체삭제
//		map1.clear();
		System.out.println(map1);
		
		// 사이즈 확인방법
		System.out.println(map1.size());
		
		
		
		System.out.println("================");
		
		
		
		// for문 사용방법
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

















