package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

// �ܺ� API ���

public class HttpMainTest5 {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/users/10");
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
			Users users = gson.fromJson(str, Users.class);
			
			System.out.println("id: \t" + users.id);
			System.out.println("name: \t" + users.name);
			System.out.println("username: \t" + users.username);
			System.out.println("email: \t" + users.email);
			System.out.println("address_street: \t" + users.address.street);
			System.out.println("address_suite: \t" + users.address.suite);
			System.out.println("address_city: \t" + users.address.city);
			System.out.println("address_zipcode: \t" + users.address.zipcode);
			System.out.println("address_geo_lat: \t" + users.address.geo.lat);
			System.out.println("address_geo_lng: \t" + users.address.geo.lng);
			System.out.println("phone: \t" + users.phone);
			System.out.println("website: \t" + users.website);
			System.out.println("company_name: \t" + users.company.name);
			System.out.println("company_catchPhrase: \t" + users.company.catchPhrase);
			System.out.println("company_bs: \t" + users.company.bs);
			
			

		} catch (MalformedURLException e) { // url�� ����ó��
			e.printStackTrace();
		} catch (IOException e) { // connection �� IO����ó��
			System.out.println(e);
		}

	}
}
