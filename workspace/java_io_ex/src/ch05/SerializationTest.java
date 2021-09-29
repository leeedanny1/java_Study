package ch05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 시리얼라이제이션을 쓰려면 Serializable 을 import해줘야 함.
class Person implements Serializable {

	String name;
	String job;

	public Person() {

	}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return name + ", " + job;
	}

}

public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person personLee = new Person("이순신", "대표이사");
		Person personKim = new Person("김유신", "상무이사");

		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			oos.writeObject(personLee);
			oos.writeObject(personKim);

		} catch (IOException e) {
			System.out.println(e);
		}

		////////////////////////////////////////////////
		// 읽어오기
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream oos = new ObjectInputStream(fis);) {

			// throws 로 예외처리
			Person p1 = (Person)oos.readObject();
			Person p2 = (Person)oos.readObject();
			
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("----- 작업을 완료했습니다. -----");
	}

}
