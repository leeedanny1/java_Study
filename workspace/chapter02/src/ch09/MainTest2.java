package ch09;

public class MainTest2 {

	public static void main(String[] args) {
		
		// staticŬ���� �̸����� ���� �����ϴ�.
		// ��ü�� �����ϱ� ������ ������ ������.
		int tempNumber = Employee.getSerialNum();
		System.out.println(tempNumber);

		System.out.println("----------------");
		
		Employee employee1 = new Employee("�̼���");
		Employee employee2 = new Employee("������");
		Employee employee3 = new Employee("Ƽ��");
		
		System.out.println(employee1.getEmployeeId());
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee3.getEmployeeId());
		
		
	}

}