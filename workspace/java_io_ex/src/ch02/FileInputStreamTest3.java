package ch02;

import java.io.FileInputStream;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		// JAVA������ auto close ����� ������.
		
		try(FileInputStream fis = new FileInputStream("assets/input.txt")){
			
			int i;
			
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
