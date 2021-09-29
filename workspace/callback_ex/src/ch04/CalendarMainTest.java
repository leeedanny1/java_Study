package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.zip.DataFormatException;

public class CalendarMainTest {

	public static void main(String[] args) {
		
		// Calendar�� ��¥ ���� �ν��Ͻ��Դϴ�. �޷��̳� �ð������� ��� �� �� ���� ���� �ν��Ͻ��Դϴ�.
		Calendar calendar = Calendar.getInstance();
		// ���� �ð��� �и��ʷ� ǥ��
		System.out.println(calendar.getTimeInMillis());

		// ���� �����ϱ� ������ ������ ���� ����� �� �ִ�.
		// ��¥�� ��ȯ ��� ����
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String date = dateFormat.format(calendar.getTimeInMillis());
		// ���� �ð��� ���� ���� format�������� ��ȯ�Ͽ� ���
		System.out.println(date);
		
	}

}
