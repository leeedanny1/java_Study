package ch04;

public class MyArticle {

	String article;
	WriteArticle writeArticle;
	
	// �ּҰ� ����
	public MyArticle(String article, WriteArticle writeArticle) {
		this.article = article;
		this.writeArticle = writeArticle;
	}
	
	public void complete() {
		writeArticle.printArticle(article);
	}
	
}
