package ch04;

public class MainTest {

	public static void main(String[] args) {
		
		// ���� ��ü ����
		HackerNews hackerNews = new HackerNews();
		SbsNews sbsNews = new SbsNews();
		MbcNews mbcNews = new MbcNews();
		
		// ��� �ۼ�
		MyArticle myArticle = new MyArticle("����, ���� ����...", hackerNews);
		myArticle.complete();
		System.out.println();
		System.out.println("--------------------");
		System.out.println();
		
		// SBS���� ��� �ۼ�
		MyArticle sbsArticle = new MyArticle("��羵�ž���..", sbsNews);
		sbsArticle.complete();
		System.out.println();
		System.out.println("--------------------");
		System.out.println();
		
		// MBC���� ��� �ۼ�
		MyArticle mbcArticle = new MyArticle("MBC, ����ϱ�ȴ� ����", mbcNews);
		mbcArticle.complete();
		System.out.println();
		System.out.println("--------------------");
		System.out.println();

	}

}
