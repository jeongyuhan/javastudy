package quiz10;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Student {

	// field
	private String name;
	private int[] scores;	// 점수들
	private double average;	// 평균  
	private char grade;		// 학점(A~F) 
	private boolean isPass;	// 합격유무(평균 60이상 "합격")
	
	// constructor
	public Student(String name) {
		this.name = name;
	}

	// method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public void setScores(int scoreCount) {
		// scoreCount만큼 임의의 점수를 scores[]에 저장
		// 1. 30% 확률 : 0  ~ 49  임의로 생성
		// 2. 40% 확률 : 50 ~ 79  임의로 생성
		// 3. 30% 확률 : 80 ~ 100 임의로 생성
		scores = new int[scoreCount];
		for(int i = 0; i < scores.length; i++) {
			if(Math.random() < 0.3) {
				scores[i] = (int)(Math.random() * 50) + 0;
			} else if (Math.random() < 0.7) {
				scores[i] = (int)(Math.random() * 30) + 50;
			} else {
				scores[i] = (int)(Math.random() * 21) + 80;
			}
		}
		// 평균 구하기
		// average, grade, isPass는 score가 정해지면 나오는 것들이기 때문에 종속된 요소들이라고 볼 수 있다.
		int total = 0;
		for(int score : scores) {
			total += score;
		}
		double average = (double)total / scores.length;
		setAverage(average);
		// 학점 구하기 && 합격 유무
		setPass(true); // 초기화를 합격으로 설정
		if(average >= 90) { setGrade('A');} // grade = 'A'}
		else if (average >= 80) { setGrade('B');}
		else if (average >= 70) { setGrade('C');}
		else if (average >= 60) { setGrade('D');}
		else {setGrade('F'); setPass(false);} // 60미만일 때만 false로 적용
	} // setScores 가 실행되면 종속된 나머지값들도 모두 나오게된다.

	public double getAverage() {
		return average;
	}

	private void setAverage(double average) {
		this.average = average;
	}

	public char getGrade() {
		return grade;
	}

	private void setGrade(char grade) {
		this.grade = grade;
	}

	public boolean isPass() {
		return isPass;
	}

	private void setPass(boolean isPass) {
		this.isPass = isPass;
	}
	
	public void info() {
		System.out.println("이름: " + name);
		System.out.println("점수: " + Arrays.toString(scores));	// [50, 72, 60, 56, 80] 과 같은 식으로 출력해주는 방법
		System.out.println("평균: " + new DecimalFormat("0.00").format(average) + "점"); // 소수 2자리만 출력해주는 방법
		System.out.println("학점: " + grade);
		System.out.println(isPass ? "합격" : "불합격");
	}
	
	
	
	// 위와 같이 setScore를 생성해두고 
	// setAverage(0.0);
	// setGrade('A');
	// setPass(false);
	// 같이 말이 안되는 코드를 넣을 수 있을까?
	// 있다... 메소드는 public 하기 때문에 빼서 사용이 가능하기 때문에 잘못되었지만 저장이 가능하다.
	// 이에 대한 해결책 = 종속되어 처리가 가능한 위의 세가지 메소드를 부르지 못하게 막아놓으면 가능하다.
	// 즉 public한 메소드를 private하게 바꿔주면 된다. 이렇게 되면 잘못된 값을 전달할 수가 없다.
	// 자주있는 일은 아니지만 안전한 코드 구성을 위한 방법일 뿐, 웬만하면 메소드는 public 하게 두는 것이 좋다.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
