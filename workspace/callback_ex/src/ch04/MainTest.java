package ch04;

public class MainTest {

	public static void main(String[] args) {
		
		// 뉴스 객체 생성
		HackerNews hackerNews = new HackerNews();
		SbsNews sbsNews = new SbsNews();
		MbcNews mbcNews = new MbcNews();
		
		// 기사 작성
		MyArticle myArticle = new MyArticle("날씨, 드디어 미쳐...", hackerNews);
		myArticle.complete();
		System.out.println();
		System.out.println("--------------------");
		System.out.println();
		
		// SBS뉴스 기사 작성
		MyArticle sbsArticle = new MyArticle("기사쓸거없네..", sbsNews);
		sbsArticle.complete();
		System.out.println();
		System.out.println("--------------------");
		System.out.println();
		
		// MBC뉴스 기사 작성
		MyArticle mbcArticle = new MyArticle("MBC, 방송하기싫다 선언", mbcNews);
		mbcArticle.complete();
		System.out.println();
		System.out.println("--------------------");
		System.out.println();

	}

}
