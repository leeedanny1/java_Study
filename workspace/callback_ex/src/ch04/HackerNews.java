package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HackerNews implements WriteArticle {
	
	private String printDate() {
		// ��¥ ������ String���� ��ȯ �ϱ� ���� ���� ����
		DateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");		
		return formatter.format(Calendar.getInstance().getTime());
	}
	

	// �������̽��� �߻�޼��� ����
	@Override
	public void printArticle(String article) {
		System.out.println(" *** HACKER NEWS *** ");		
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("��� �ۼ���: " + printDate());
	}

}
