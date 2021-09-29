package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class BufferedStreamTest {

	public static void main(String[] args) {

		long millisecond = 0;

		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");

				// ������Ʈ��
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				) {

			// ���� �ð� ���
			millisecond = System.currentTimeMillis();

			int i;

			// 1����Ʈ�� �о����
//			while ((i = fis.read()) != -1) {
//				fos.write(i);
//			}

			// ���� ����Ʈ�� �о����(������Ʈ�� �̿�)
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}

			// �Ʊ� ����ߴ��ð��̶� ���ݽð� ��
			millisecond = System.currentTimeMillis() - millisecond;

		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println("���� �����ϴµ� �ɸ� �ð��� " + millisecond + "�и��� "
				+ "�Դϴ�.");
		
		
		// ������� ���� ���� ��ü
		// ���� �� ���� �ʴ� �����.
		// ���δ����� �о���̴� ���
//		Socket socket = new Socket();
//		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		br.readLine();
		

	}

}








