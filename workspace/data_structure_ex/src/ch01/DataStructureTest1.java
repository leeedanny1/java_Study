package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

// set 자료구조
// set은 순서가 없고, 중복값을 허용하지 않는다.

public class DataStructureTest1 {

	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		set1.add(1);
		set1.add(1); // 중복값
		set1.add(2);
		set1.add(3);
		set1.add(3); // 중복값
		set1.add(3); // 중복값
		
		// 사이즈 확인
		System.out.println(set1.size());
		
		System.out.println("====================");
		
		// 제거하기
		set1.remove(1);
		// 내용물 확인
		System.out.println(set1);
		
		System.out.println("====================");
		
		// 전체제거
//		set1.clear();
		System.out.println(set1);
		
		System.out.println("====================");
		
		// 내용물 있는지 여부 확인
		System.out.println(set1.isEmpty());
		
		
		System.out.println("====================");
		System.out.println("====================");
		
		
		// for문 사용 방법
		// set은 순서가 없기 때문에 값을 확인 할 수 없다.
		for (int i = 0; i < set1.size(); i++) {
			System.out.println("set1값 확인: " + i);
		}
		
		System.out.println("====================");
		
		// for each 문으로는 사용 가능
		for (Integer integer : set1) {
			System.out.println(integer);
		}
		
		System.out.println("====================");
		
		// while문 사용 방법
		// Iterator
		// 요소 순회(반복자)컬렉션 프레임워크에 저장된 요소를 하나씩 차례로 참조하는 것
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("값 확인: " + iter.next());
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
	
	
	// 랜덤 메소드 작성
	public static int getRandomNumber() {
		Random random = new Random();
		int value = random.nextInt(45) +1;
		return value;
	}
	
	
	
	
	

}
















