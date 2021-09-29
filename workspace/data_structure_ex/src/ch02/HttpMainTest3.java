package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

// Photos

public class HttpMainTest3 {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/photos/100");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET"); // 반대: POST
			connection.setRequestProperty("Content-type", "application/json");
			connection.connect();

			// 연결되었는지 코드 확인하는것. 정상: 200, 못찾음: 404
			int statusCode = connection.getResponseCode();
			System.out.println("statusCode: " + statusCode);

			// 보조스트림과 기반스트림이용, 디자인패턴
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			StringBuffer sb = new StringBuffer();
			String line = null;

			// 방어적코드
			if (statusCode == 200) {
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
			} else {
				System.out.println("서버에 연결할 수 없습니다.");
			}
			
			System.out.println("====================");

			// gson이 알아서 해줌
			String str = sb.toString();
			Gson gson = new Gson();
			Post post = gson.fromJson(str, Post.class);
			
			System.out.println(post.userId);
			System.out.println(post.id);
			System.out.println(post.title);
			System.out.println(post.body);
			
			

		} catch (MalformedURLException e) { // url의 예외처리
			e.printStackTrace();
		} catch (IOException e) { // connection 의 IO예외처리
			System.out.println(e);
		}

	}
}
