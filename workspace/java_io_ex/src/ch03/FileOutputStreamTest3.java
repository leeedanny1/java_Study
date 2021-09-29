package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		
		// try()
		// fileOutStream
		// A~Z
		// fos.write(bs, 2, 10); 배열의 2번째 위치부터 10개바이트 출력
		
		try(FileOutputStream fos = new FileOutputStream("output3.txt", false)){
			// 26개의 배열 생성
			byte[] bs = new byte[26];
			// 65(A)부터 시작, ASCII 코드값
			byte data = 65;
			
			// 26번 반복하면서 하나씩 증가한 문자 기록
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			// bs에 저장된것 fos돌림 (2번 부터 10개)
			// offset
			fos.write(bs, 2, 10);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("===== 출력이 완료되었습니다. =====");

	}

}
