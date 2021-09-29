package ch01;

// 01-03 데이터타입-문자형char
// 문자형 테스트
public class CharacterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 실제로 저장되는값은 정수로 저장됨. 이를 인코딩이라 부름
		// 정수를 다시 문자로 불러오는 과정은 디코딩이라 한다.
		
		char ch1 = 'A';
		System.out.println(ch1);
		// (자료형) 적어주는것을 형변환이라 부름
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		// char 타입은 음수값 대입 불가.
		// char ch3 = -67;
		
		
		char ch4 = '한';
		System.out.println((int)ch4);
		
		
		System.out.println("--------------------------------------------");
		// 문제1. 안, 녕, 하, 세, 요
		// 각각의 문자들을 정수값으로 하나씩 출력해 보세요.
		char a = '안';
		char b = '녕';
		char c = '하';
		char d = '세';
		char e = '요';
		System.out.println((int)a);
		System.out.println((int)b);
		System.out.println((int)c);
		System.out.println((int)d);
		System.out.println((int)e);
	}

}
