package ch01;

public class StudentMainTest2 {

	public static void main(String[] args) {

		//선언과 동시에 초기화
		Student student1 = new Student();
		
		student1.name = "이대희";
		student1.height = 180;
		student1.weight = 70;
		
		System.out.println(student1);
		System.out.println(student1.name);
		System.out.println(student1.height);
		System.out.println(student1.weight);
		
		
		System.out.println("=============================");
		
		
		Student stud2 = new Student();
		
		stud2.name = "이순신";
		stud2.height = 180;
		stud2.weight = 77;
		
		System.out.println(stud2.name);
		System.out.println(stud2.height);
		System.out.println(stud2.weight);		
		
	} //end of main

} //end of class
