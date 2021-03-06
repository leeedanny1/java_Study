package ch12;

import java.util.ArrayList;

public class ArrayListMainTest {

	public static void main(String[] args) {

		Book book1 = new Book(1, "흐르는강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");

		// ArrayList
		// 사용방법
		ArrayList<Book> shoppingCart = new ArrayList<Book>();

		// 추가방법1
		// 데이터 추가하기(값 넣기) 3개만넣어보기
		shoppingCart.add(book1); // [0]
		shoppingCart.add(book3); // [1]
		shoppingCart.add(book5); // [2]

		// 추가방법2
		// 원하는 idx에 데이터 저장, 나머지 뒤로 밀림
		shoppingCart.add(0, book4);

		
		// 화면 출력
		// 방어적 코드를 짜지 않아도 됨. 오류를 일으킬 확률을 줄인다.
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		// 사이즈
		int mySize = shoppingCart.size();
		System.out.println("ArrayList's Size: " + mySize);
		// Arraylist 의 크기는 3
		// Arraylist 의 index의 범위는 0~2

		
		// 삭제
		// 개별삭제
		shoppingCart.remove(3);

		System.out.println("------------");

		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}

		System.out.println("====================");

		
		// 수정하기 set
		shoppingCart.set(1, book4);
		for (Book book : shoppingCart) {
			book.showInfo();
		}

		
		
		// CRUD
		// Create, Read, Update, Delete
		
		
	}

}
