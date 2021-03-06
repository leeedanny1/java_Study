package ch11;

import java.util.Iterator;

public class ArrayMainTest {

	public static void main(String[] args) {

		/*
		배열
		: 연관된 데이터를 모아서 통으로 관리하기 위해 사용하는 데이터 타입이다.
		변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러개의 데이터를 하나의 변수에 저장하기 위한 것이라고 할 수 있다.
		*/
		
		// 일반 변수
		int number = 10;
		
		
		// 배열 선언 방법
		// 첫 번째 방법 많이 사용함
		int[] arr1 = new int[3];
		int arr2[] = new int[10];
		
		// 초기화 하는 방법
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		
		// 배열 선언과 동시에 초기화하기
		int[] numbers1 = new int[] {11, 20, 30};
		int[] numbers2 = {10, 50, 100};
		
		// 출력 방법
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		
		
		// String 배열 선언 방법
		String[] strArr = new String[10];
		
		// 초기화
		strArr[0] = "야스오";
		strArr[1] = "티모";
		strArr[2] = "애쉬";
		strArr[3] = "다리우스";
		
		// strArr 값 출력
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		
		// 모든 프로그램 언어에서 index는 0부터 시작함!!!!
		
		
		// 배열을 사용할 때 보통 for문과 연계해서 많이 사용함
		System.out.println(strArr.length);
		// System.out.println(strArr[10]); 
		// index의 크기는 n-1개
		
		for (int i = 0; i < strArr.length; i++) {
			if(strArr[i] != null) {
				System.out.println(strArr[i]);
			}
		}	
		
		
	}

}
