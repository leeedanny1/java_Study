package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {

		// 10바이트씩 읽어오기
		try (FileInputStream fis = new FileInputStream("assets/input2.txt")) {
			byte[] bs = new byte[10];
			int i;

			while ((i = fis.read(bs)) != -1) {
				// 이렇게 읽으면 마지막에 남는게 떠버림
//				for (byte b : bs) {
//					System.out.print((char)b);
//				}System.out.println();

				// 응용해서 있는 만큼만 읽어오기
				for (int j = 0; j < i; j++) {
					System.out.print((char) bs[j]);
				}
				System.out.println(" : " + i + "바이트 읽음");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
