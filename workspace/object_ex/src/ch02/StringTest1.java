package ch02;

public class StringTest1 {

	public static void main(String[] args) {
		
		//String ������
		//heap�޸𸮿� �ν��Ͻ��� �����Ǵ� ���
		String str1 = new String("abc");
		// constant pool (Data, static)�� �ּҸ� �����ϴ� ���
		String str2 = "abc";
		
		// ���: �� �޸𸮴� ������ �� ���� �ٸ� �ּҰ��� ��������, ��� Ǯ�� ������ ���ڿ��� ��� ���� �ּҰ��� ����.
		
		System.out.println(str1 == str2);
		
		
		String str3 = new String("abc");
		System.out.println(str1 == str2);
		
		
		// ���� �ּҰ��� ����.
		String str4 = "abc";
		String str5 = "abc";
		System.out.println(str4 == str5);
		
	}
	
}
