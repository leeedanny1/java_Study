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

				// 보조스트림
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				) {

			// 현재 시간 기록
			millisecond = System.currentTimeMillis();

			int i;

			// 1바이트씩 읽어오기
//			while ((i = fis.read()) != -1) {
//				fos.write(i);
//			}

			// 여러 바이트씩 읽어오기(보조스트림 이용)
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}

			// 아까 기록했던시간이랑 지금시간 비교
			millisecond = System.currentTimeMillis() - millisecond;

		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println("파일 복사하는데 걸린 시간은 " + millisecond + "밀리초 "
				+ "입니다.");
		
		
		// 소켓통신 사용시 쓰는 객체
		// 요즘엔 잘 쓰지 않는 방식임.
		// 라인단위로 읽어들이는 방법
//		Socket socket = new Socket();
//		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		br.readLine();
		

	}

}








