package ch05;

public class Student {

	// �й�, �̸�, �����, ���м���
	int studentId;
	String name;
	Subject korea;
	Subject math;
	
	
	// ������
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
		// ����Ÿ�� ��ü�� �� ���� ��ü���� ����� ���� �ؾ���!!!!!!!!!!!!!!!
		korea = new Subject();
		math = new Subject();
	}
	
	
	// ���� ���� �Է� �޼ҵ�
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;		
	}
	
	// ���� ���� �Է� �޼ҵ�
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;		
	}
	
	// �л� ���� ��� �޼ҵ�
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println("�л��� �̸���: " + name + ", ������: " + total + ", �����: " + (total/2));
	}



	
	
}
