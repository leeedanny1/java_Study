package ch01;

// 01-02 데이터 타입
//정수형
public class DataType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수형
		byte b;
		short s;
		int i;
		long l;
		
		
		
		// byte 의 크기는 +-128
		b = 127;
		System.out.println(b);
		b = -128;
		System.out.println(b);
		// b = 128;		byte의 범위를 초과
		// b = -129;

		
		// int 의 크기는 약 +-21억 정도
		i = 2100000000;
		System.out.println(i);
		
		
		// long타입은 정수 뒤에 L을 붙여줘야 함.
		// 헷갈릴 수 있으니 대문자 L을 권장함.
		// 이를 접미사라고 함.
		l = 2200000000L;
		System.out.println(l);
		
		
	}

}
