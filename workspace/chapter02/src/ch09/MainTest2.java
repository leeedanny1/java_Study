package ch09;

public class MainTest2 {

	public static void main(String[] args) {
		
		// static클래스 이름으로 접근 가능하다.
		// 객체를 생성하기 전에도 접근이 가능함.
		int tempNumber = Employee.getSerialNum();
		System.out.println(tempNumber);

		System.out.println("----------------");
		
		Employee employee1 = new Employee("이순신");
		Employee employee2 = new Employee("김유신");
		Employee employee3 = new Employee("티모");
		
		System.out.println(employee1.getEmployeeId());
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee3.getEmployeeId());
		
		
	}

}
