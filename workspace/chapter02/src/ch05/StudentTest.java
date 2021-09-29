package ch05;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(10, "Lee");
		
		// 참조타입 객체를 쓸때는 객체생성 안 하면 ERROR!!
		// 야근의 주요원인!
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 80);
		studentLee.showStudentScore();

		
		// 객체생성
		Student studentKim = new Student(20, "Kim");
		// 성적입력
		studentKim.setKoreaSubject("국어", 50);
		studentKim.setMathSubject("수학", 70);
		// 성적출력
		studentKim.showStudentScore();
	}

}
