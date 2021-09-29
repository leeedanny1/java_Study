package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {

		FileOutputStream fos = new FileOutputStream("output2.txt", false);

		// auto close는 java9부터 제공
		try (fos) {

			byte[] bs = new byte[26];
			byte data = 65;

			// for문 사용
			// 길이 26 반복해서 A-Z 파일에 작성
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
		} catch (IOException e) {
		}

	}

}
