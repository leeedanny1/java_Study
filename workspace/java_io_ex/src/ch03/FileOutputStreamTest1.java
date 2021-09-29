package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		
		// output은 파일이 없으면 자동으로 생성해줌.
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)){ //true 위치에 기본값은 false-덮어쓰기, true-계속쓰기
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
