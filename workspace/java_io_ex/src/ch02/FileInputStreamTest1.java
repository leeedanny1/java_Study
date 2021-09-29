package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("assets/input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	// 메모리 낭비를 없애기 위해 다 수행된 후 종료한다.
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		System.out.println("end: 프로그램 먹통 안됨!, 예외처리가 중요하다!!!");
		

	}

}
