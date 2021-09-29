package ch01;

// 01-02 데이터 타입
//문자 자료형
public class DataType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자 자료형
		//2바이트 공간에 문자를 담을 수 있는 데이터 자료형
		char name;
		char a;
		char initial;
		
		//값 초기화
		name = 100;
		System.out.println(name);
		name = 'A'; // 홑 따옴표를 사용하고, 오직 하나의 글자만 변수에 저장 할 수 있다.
		System.out.println(name);
		// name = 'AB';
		
		System.out.println();
		a = 'C';
		initial = 'D';
		System.out.println(a);
		System.out.println(initial);
	}

}
