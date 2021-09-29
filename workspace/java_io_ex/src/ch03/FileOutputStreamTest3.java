package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		
		// try()
		// fileOutStream
		// A~Z
		// fos.write(bs, 2, 10); �迭�� 2��° ��ġ���� 10������Ʈ ���
		
		try(FileOutputStream fos = new FileOutputStream("output3.txt", false)){
			// 26���� �迭 ����
			byte[] bs = new byte[26];
			// 65(A)���� ����, ASCII �ڵ尪
			byte data = 65;
			
			// 26�� �ݺ��ϸ鼭 �ϳ��� ������ ���� ���
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			// bs�� ����Ȱ� fos���� (2�� ���� 10��)
			// offset
			fos.write(bs, 2, 10);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("===== ����� �Ϸ�Ǿ����ϴ�. =====");

	}

}
