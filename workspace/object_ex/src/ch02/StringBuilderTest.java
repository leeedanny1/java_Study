package ch02;

public class StringBuilderTest {

	public static void main(String[] args) {

		
		// StringBuilder, StringBuffer 활용하기
		// 내부적으로 가변적인 char[]를 멤버 변수로 가짐.
		// !!!!문자열을 여러번 연결하거나 변경할 때 사용하면 유용함!!!!
		// StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화(synchronization)를 보장
		// 단일 쓰레드 프로그램에서는 StringBuilder 사용하기를 권장
		
		// String str1, StringBuilder str2
		// toString() 메서드로 string 반환
		
		String java = new String("java");
		String android = new String("android");
		
		// StringBuilder로 buffer에다가 java삽입
		StringBuilder buffer = new StringBuilder(java);
		// buffer의 주소값 확인
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android); // java + android
		// android추가 한 후 주소값 확인
		System.out.println(System.identityHashCode(buffer));
		
		// buffer에 들어있는 내용을 string에다가 String타입으로 변환 후 저장
		java = buffer.toString();
		System.out.println(java);
		
		
	}

}
