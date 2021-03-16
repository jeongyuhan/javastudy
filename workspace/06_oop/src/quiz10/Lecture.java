package quiz10;

import java.text.DecimalFormat;

import javax.swing.DebugGraphics;

public class Lecture {

	// field
	private String lectureName;
	private Student[] students;

	// constructor
	public Lecture(String lectureName, String[] names) {
		this.lectureName = lectureName;
		// Studend[] 배열 생성
		students = new Student[names.length];
		// 각 학생 생성
		for (int i = 0; i < names.length; i++) {
			students[i] = new Student(names[i]); // Student() 생성자를 호출하여 이름을 차곡차곡 저장해준다.
		}
	}

	// method
	public void exam(int scoreCount) {
		for (Student student : students) {
			student.setScores(scoreCount);
		}
	}
	
	public double getLectureAverage() {
		double total = 0.0;
		for(Student student : students) {
			total += student.getAverage();
		}
		return total / students.length;
	}
	
	public void info() {
		System.out.println("강좌명: " + lectureName);
		System.out.println("강좌평균: " + new DecimalFormat("0.00").format(getLectureAverage()));
		System.out.println("=======학생별 성적 현황=======");
		for(Student student : students) {
			student.info();
			System.out.println("-------------------------------");
		}
	}
	
	
}
