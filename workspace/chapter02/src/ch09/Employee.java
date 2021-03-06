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
		// !!static변수 주의!!
		// static메소드 안에서는 멤버변수를 사용 할 수 없다.
		// why: 객체가 만들어지기 전에 접근해서 사용할 수 있는 static이기 때문.
//		department = "홍보팀";
		return serialNum;
	}

}
