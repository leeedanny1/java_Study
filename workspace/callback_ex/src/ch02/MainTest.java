package ch02;

public class MainTest {

	public static void main(String[] args) {
		
		Activity1 activity1 = new Activity1("��Ƽ��Ƽ1");
		Activity2 activity2 = new Activity2("��Ƽ��Ƽ2");
		
		// �޼ҵ带 ����ؼ� callBack �����ϱ�
		activity2.setCallbackCheckPosition(activity1.callBackcheckPosition);

	}

}
