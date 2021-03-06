package ch12;

import java.util.Iterator;

public class ArrayMainTest {

	public static void main(String[] args) {

		Book book1 = new Book(1, "흐르는강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");

		// 문제
		// 배열을 이용해 shoppingCart에 담아봅시다.
		// 1. 배열선언, 크기를 10으로 생성
		Book[] shoppingCart = new Book[10];
		// 2. 사고싶은 책을 장바구니에 담아보세요
		shoppingCart[0] = book1;
		shoppingCart[1] = book3;
		shoppingCart[2] = book5;
		// 3. 장바구니에 담은 정보를 출력하세요, 단 null은 출력하지 마세요
		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}
		System.out.println("-------------------------");
		// 확장for문
		for (Book book : shoppingCart) {
			// 방어적코드
			if(book != null) {
				book.showInfo();	
			}
		}
		
		System.out.println("-----------------------");
		
		// 인덱스 [2번을 지워보세요
		shoppingCart[2] = null;
		// 확장for문
		for(Book abc : shoppingCart) {
			//방어적코드
			if(abc != null) {
				abc.showInfo();
			}
		}

	}
}
