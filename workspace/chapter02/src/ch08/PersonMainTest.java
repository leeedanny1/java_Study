package ch08;

public class PersonMainTest {

	public static void main(String[] args) {

		Person person1 = new Person();
		System.out.println(person1);
		System.out.println(person1.name);
		System.out.println(person1.age);
		
		System.out.println("-----------------");
		
		//3
		Person pv = person1.getPerson();
		System.out.println(pv);
		
		
		
		

	}

}
