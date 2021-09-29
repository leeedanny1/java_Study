package ch02;

public class MainTest {

	public static void main(String[] args) {
		
		Activity1 activity1 = new Activity1("액티비티1");
		Activity2 activity2 = new Activity2("액티비티2");
		
		// 메소드를 사용해서 callBack 연결하기
		activity2.setCallbackCheckPosition(activity1.callBackcheckPosition);

	}

}
