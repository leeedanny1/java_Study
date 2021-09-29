package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SbsNews implements WriteArticle {

	private String printDate() {
		// 날짜 형식을 String으로 변환 하기 위한 포맷 형식
		DateFormat formatter = new SimpleDateFormat("yyyyMMddhhmm");		
		return formatter.format(Calendar.getInstance().getTime());
	}
	
	
	// 인터페이스의 메소드 구현
	@Override
	public void printArticle(String article) {
		System.out.println("SBS뉴스에 오신걸 환영합니다.");
		System.out.println();
		System.out.println("기사 일련번호: " + printDate());
		System.out.println();
		System.out.println("기사 제목: " + article);
	}
	

}
