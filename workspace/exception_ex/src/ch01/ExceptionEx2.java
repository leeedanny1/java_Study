package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {

	public static void main(String[] args) {

		FileInputStream fis;
		
		
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// try문에서 return은 잘 안씀.
			return; // 심지어 return문이 있어도 finally가 실행됨!!!!!!!
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			// try문이 실행되면 반드시 실행되는 구문
			System.out.println("여기도 실행이 되나요?");
		}
		
		

	}

}
