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

			connection.setRequestMethod("GET"); // �ݴ�: POST
			connection.setRequestProperty("Content-type", "application/json");
			connection.connect();

			// ����Ǿ����� �ڵ� Ȯ���ϴ°�. ����: 200, ��ã��: 404
			int statusCode = connection.getResponseCode();
			System.out.println("statusCode: " + statusCode);

			// ������Ʈ���� ��ݽ�Ʈ���̿�, ����������
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			StringBuffer sb = new StringBuffer();
			String line = null;

			// ������ڵ�
			if (statusCode == 200) {
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
			} else {
				System.out.println("������ ������ �� �����ϴ�.");
			}
			
			System.out.println("====================");

			// gson�� �˾Ƽ� ����
			String str = sb.toString();
			Gson gson = new Gson();
			Post post = gson.fromJson(str, Post.class);
			
			System.out.println(post.userId);
			System.out.println(post.id);
			System.out.println(post.title);
			System.out.println(post.body);
			
			

		} catch (MalformedURLException e) { // url�� ����ó��
			e.printStackTrace();
		} catch (IOException e) { // connection �� IO����ó��
			System.out.println(e);
		}

	}
}
