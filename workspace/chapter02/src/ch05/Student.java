package ch05;

public class Student {

	// 학번, 이름, 국어성적, 수학성적
	int studentId;
	String name;
	Subject korea;
	Subject math;
	
	
	// 생성자
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
		// 참조타입 객체를 쓸 때도 객체생성 까먹지 말고 해야함!!!!!!!!!!!!!!!
		korea = new Subject();
		math = new Subject();
	}
	
	
	// 국어 성적 입력 메소드
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;		
	}
	
	// 수학 성적 입력 메소드
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;		
	}
	
	// 학생 성적 출력 메소드
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println("학생의 이름은: " + name + ", 총점은: " + total + ", 평균은: " + (total/2));
	}



	
	
}
