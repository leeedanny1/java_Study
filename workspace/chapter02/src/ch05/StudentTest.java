package ch05;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(10, "Lee");
		
		// ����Ÿ�� ��ü�� ������ ��ü���� �� �ϸ� ERROR!!
		// �߱��� �ֿ����!
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 80);
		studentLee.showStudentScore();

		
		// ��ü����
		Student studentKim = new Student(20, "Kim");
		// �����Է�
		studentKim.setKoreaSubject("����", 50);
		studentKim.setMathSubject("����", 70);
		// �������
		studentKim.showStudentScore();
	}

}