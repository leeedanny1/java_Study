package ch03;

public class MainTest {

	public static void main(String[] args) {

		Activity1 activity1 = new Activity1("액티비티1");
		Activity2 activity2 = new Activity2("액티비티2");
		
		activity2.setCallBackCheckPosition(activity1.callBackCheckPosition);

	}

}
