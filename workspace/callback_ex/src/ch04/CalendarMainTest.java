package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.zip.DataFormatException;

public class CalendarMainTest {

	public static void main(String[] args) {
		
		// Calendar란 날짜 관련 인스턴스입니다. 달력이나 시간계산등을 사용 할 때 많이 쓰는 인스턴스입니다.
		Calendar calendar = Calendar.getInstance();
		// 현재 시간을 밀리초로 표현
		System.out.println(calendar.getTimeInMillis());

		// 보기 불편하기 때문에 형식을 만들어서 사용할 수 있다.
		// 날짜로 변환 방법 지정
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String date = dateFormat.format(calendar.getTimeInMillis());
		// 현재 시간을 내가 정한 format형식으로 변환하여 출력
		System.out.println(date);
		
	}

}
