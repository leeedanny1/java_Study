package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SbsNews implements WriteArticle {

	private String printDate() {
		// ��¥ ������ String���� ��ȯ �ϱ� ���� ���� ����
		DateFormat formatter = new SimpleDateFormat("yyyyMMddhhmm");		
		return formatter.format(Calendar.getInstance().getTime());
	}
	
	
	// �������̽��� �޼ҵ� ����
	@Override
	public void printArticle(String article) {
		System.out.println("SBS������ ���Ű� ȯ���մϴ�.");
		System.out.println();
		System.out.println("��� �Ϸù�ȣ: " + printDate());
		System.out.println();
		System.out.println("��� ����: " + article);
	}
	

}
