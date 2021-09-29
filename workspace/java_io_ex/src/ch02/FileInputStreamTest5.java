package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("assets/input2.txt")){
			byte[] bs = new byte[10];
			// offset�� ����
//			fis.read(bs, 0, 5);
//			for(byte b : bs) {
//				System.out.println((char)b);
//			}
			System.out.println("==============");
			
			// ����1
			// for user index array ���
			int i;

			// �迭 �ε��� ũ�⿡ �����Ұ�!
			while ((i = fis.read(bs, 0, 5)) != -1) {
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
