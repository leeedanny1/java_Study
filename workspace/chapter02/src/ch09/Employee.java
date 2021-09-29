package ch09;

public class Employee {

	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;

	// constructor
	public Employee(String employeeName) {
		serialNum++;
		employeeId = serialNum;
		this.employeeName = employeeName;
	}

	// getter
	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getDepartment() {
		return department;
	}
	
	public static int getSerialNum() {
		// !!static���� ����!!
		// static�޼ҵ� �ȿ����� ��������� ��� �� �� ����.
		// why: ��ü�� ��������� ���� �����ؼ� ����� �� �ִ� static�̱� ����.
//		department = "ȫ����";
		return serialNum;
	}

}