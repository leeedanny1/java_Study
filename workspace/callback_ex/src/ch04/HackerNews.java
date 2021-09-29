package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HackerNews implements WriteArticle {
	
	private String printDate() {
		// 날짜 형식을 String으로 변환 하기 위한 포맷 형식
		DateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");		
		return formatter.format(Calendar.getInstance().getTime());
	}
	

	// 인터페이스의 추상메서드 구현
	@Override
	public void printArticle(String article) {
		System.out.println(" *** HACKER NEWS *** ");		
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일: " + printDate());
	}

}
