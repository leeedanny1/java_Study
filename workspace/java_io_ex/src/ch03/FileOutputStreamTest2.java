package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {

		FileOutputStream fos = new FileOutputStream("output2.txt", false);

		// auto close�� java9���� ����
		try (fos) {

			byte[] bs = new byte[26];
			byte data = 65;

			// for�� ���
			// ���� 26 �ݺ��ؼ� A-Z ���Ͽ� �ۼ�
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
		} catch (IOException e) {
		}

	}

}
