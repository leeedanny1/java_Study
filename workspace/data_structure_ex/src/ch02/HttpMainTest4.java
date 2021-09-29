package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

// �ܺ� API ���

public class HttpMainTest4 {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/comments/10");
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
			Comments comments = gson.fromJson(str, Comments.class);
			
			System.out.println(comments.postId);
			System.out.println(comments.id);
			System.out.println(comments.name);
			System.out.println(comments.email);
			System.out.println(comments.body);
			
			

		} catch (MalformedURLException e) { // url�� ����ó��
			e.printStackTrace();
		} catch (IOException e) { // connection �� IO����ó��
			System.out.println(e);
		}

	}
}
