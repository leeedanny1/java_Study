package ch02;

public class StringBuilderTest {

	public static void main(String[] args) {

		
		// StringBuilder, StringBuffer Ȱ���ϱ�
		// ���������� �������� char[]�� ��� ������ ����.
		// !!!!���ڿ��� ������ �����ϰų� ������ �� ����ϸ� ������!!!!
		// StringBuffer�� ��Ƽ ������ ���α׷��ֿ��� ����ȭ(synchronization)�� ����
		// ���� ������ ���α׷������� StringBuilder ����ϱ⸦ ����
		
		// String str1, StringBuilder str2
		// toString() �޼���� string ��ȯ
		
		String java = new String("java");
		String android = new String("android");
		
		// StringBuilder�� buffer���ٰ� java����
		StringBuilder buffer = new StringBuilder(java);
		// buffer�� �ּҰ� Ȯ��
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android); // java + android
		// android�߰� �� �� �ּҰ� Ȯ��
		System.out.println(System.identityHashCode(buffer));
		
		// buffer�� ����ִ� ������ string���ٰ� StringŸ������ ��ȯ �� ����
		java = buffer.toString();
		System.out.println(java);
		
		
	}

}
