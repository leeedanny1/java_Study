package ch02;

// 02-02. 형변환
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 형변환
		// 형변환: 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것.
		// 1. 묵시적 형 변환 (자동 형 변환)
		// 2. 명시적 형 변환 (강제 형 변환)
		
		// ex) int 자료형을 double형으로 변경하거나 double자료형을 int자료형으로 변경하는것
		
		
		int iNum1 = 100;
		double dNumber = 1.12345;
		System.out.println(iNum1);
		System.out.println(dNumber);
		
		// 자동 형 변환
		// int값을 double 변수에 넣었더니 자동으로 double자료형으로 바뀜
		double dNum1 = iNum1;
		System.out.println(dNum1);
		
		// 강제 형 변환
		// 큰 자료형을 작은 자료형에 넣으려면 강제 형 변환이 필요하다.
		// int iNumber = dNumber;
		int iNumber = (int)dNumber;
		System.out.println(iNumber);
		// 소숫점 이하 값 버리고 데이터를 저장
		// 강제 형 변환시 데이터의 손실이 발생한다.
		
		
		
		
		
		System.out.println("------------------------------------");
		//연습문제
		double dValue;
		int iValue;
		
		dValue = 0.5;
		iValue = (int)10.9; //명시적 형변환
		
		//문제. iValue의 출력값은 얼마일까요?
		System.out.println(iValue);
	}

}
