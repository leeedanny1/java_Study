package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpMainTest1 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos/10");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			
			connection.setRequestMethod("GET");	// �ݴ�: POST
			connection.setRequestProperty("Content-type", "application/json");
			connection.connect();
			
			// ����Ǿ����� �ڵ� Ȯ���ϴ°�. ����: 200, ��ã��: 404
			int statusCode = connection.getResponseCode();
			System.out.println("statusCode: " + statusCode);
			
			//������Ʈ���� ��ݽ�Ʈ���̿�, ����������
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			StringBuffer sb = new StringBuffer();
			String line = null;
			
			// ������ڵ�
			if(statusCode == 200) {
				while( (line = reader.readLine()) != null) {
					sb.append(line);
				}
			} else {
				System.out.println("������ ������ �� �����ϴ�.");
			}
			
			String str = sb.toString();
			System.out.println(str);
			
			System.out.println("========================");

			// ������ �̷��� �߾��������, HttpMainTest2 Ŭ����ó��
//			// substr �̿� ���ϴ� ����(��)�� ���
//			System.out.println(str.substring(4, 10));
//			System.out.println(str.substring(13, 14));
//			
//			// Todo Ŭ���� ����
//			Todo todo = new Todo();
//			todo.id = str.substring(4, 10);
			
			
		} catch (MalformedURLException e) {		// url�� ����ó��
			e.printStackTrace();
		} catch (IOException e) {		//connection �� IO����ó��
			System.out.println(e);
		}

	}

}
