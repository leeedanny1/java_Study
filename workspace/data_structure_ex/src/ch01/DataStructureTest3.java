package ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	String name;
	int grade;
}


// List 자료구조
// 순서(index)가 있고, 중복값을 허용한다.
// null값 허용

public class DataStructureTest3 {

	public static void main(String[] args) {
		
		List list0;
		
		// 순서가 있고, 중복이 가능
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Student> members = new ArrayList<Student>();
		
		// 값 추가 방법
		list.add(3);			// idx 0
		list.add(null);		// idx 1	-> idx 2
		list.add(1, 10); 	// 1번 index로 값 10 추가	-> idx 1
		System.out.println("값 추가 확인: " + list);
		
		// 값 삭제방법
		list.remove(2);	// 2번 idx의 값 삭제
//		list.clear(); 		// 전체 삭제
		System.out.println("값 삭제 확인: " + list);
		
		// 사이즈 확인
		System.out.println("사이즈 확인: " + list.size());
		
		System.out.println("========================");
		
		// 값 출력방법
		System.out.println(list.get(1));
		
		// for
		for (Integer i : list) {
			System.out.println("for 사용법: " + i);
		}
		
		// while
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("while문으로 값 확인: " + iter.next());
		}
		
		System.out.println("----------------------------");
		
		// ArrayList 값 검색
		// 있나? 없나? 여부만 확인
		// 리스트안에 값이 있는지 확인, return값은 T/F
		System.out.println(list.contains(1));
		System.out.println(list.contains(10));
		
		// idx값 찾기
		// 값이 있으면 idx번호 반환, 없으면 -1 반환
		System.out.println(list.indexOf(3));	// 3값을 저장하고 있는 idx번호 확인
		System.out.println(list.indexOf(10));	// 10값을 저장하고 있는 idx번호 확인
		System.out.println(list.indexOf(100));	// 100(없는값)값을 저장하고 있는 idx번호 확인: -1 반환
		

		
		
	}

}








