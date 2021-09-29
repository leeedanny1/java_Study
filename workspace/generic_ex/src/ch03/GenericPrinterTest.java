package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// 재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// 사용할 때 자료형을 넣어주면 된다.
		// 사용방법: T대신 사용할 때 어떤 자료형을 사용할지 지정해주면 된다.
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>(); // 컴파일시점
		
		// 재료넣기
		genericPrinter.setMaterial(powder);
		
		// 재료꺼내기
		Powder tempPowder = genericPrinter.getMaterial();
		System.out.println(tempPowder.toString());
		
		
		
		// 문제1. 플라스틱을 사용해 넣고 꺼내보자!
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>();
		genericPrinter2.setMaterial(plastic);
		
		Plastic plastic2 = genericPrinter2.getMaterial();
		System.out.println(plastic2);
		

	}

}
