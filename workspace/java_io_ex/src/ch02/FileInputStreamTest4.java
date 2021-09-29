package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {

		// 10����Ʈ�� �о����
		try (FileInputStream fis = new FileInputStream("assets/input2.txt")) {
			byte[] bs = new byte[10];
			int i;

			while ((i = fis.read(bs)) != -1) {
				// �̷��� ������ �������� ���°� ������
//				for (byte b : bs) {
//					System.out.print((char)b);
//				}System.out.println();

				// �����ؼ� �ִ� ��ŭ�� �о����
				for (int j = 0; j < i; j++) {
					System.out.print((char) bs[j]);
				}
				System.out.println(" : " + i + "����Ʈ ����");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
