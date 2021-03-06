package ex02_2d_array;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		// 성적 관리 프로그램
		// 각 점수는 입력받는다.
		// 학생별 총점과 과목별 총점 구해서 출력하기
		// 스폰지밥의 국어 점수 >>> 10
		// 스폰지밥의 영어 점수 >>> 10
		// 스폰지밥의 수학 점수 >>> 10
		// .......
		//      	국어	영어	수학	학생합계
		// 스폰지밥	10	10	10	30
		// 타요		10	10	10	30
		// 브레드		10	10	10	30
		// 과목합계	30	30	30	90
		Scanner sc = new Scanner(System.in);
	
		String[] names = {"스폰지밥", "타요", "브레드", "과목합계"};
		String[] subjects = {"국어", "영어", "수학", "학생합계"};
		int[][] scores = new int[names.length][subjects.length];
		
		
		/*
		int score = 0;
		for(String n : names) {
			for(String m : subjects) {
				System.out.println(n + "의" + m + "점수 >>>");
				score = sc.nextInt();
			}
		}
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				
			}
		}
		*/
		
		
		// 선생님이 푼 해답)
		
		// 입력부 및 계산 코드 생성
		for(int i = 0; i < names.length -1; i++) {
			for(int j = 0; j < subjects.length -1; j++) {
				System.out.println(names[i] + "의 " + subjects[j] + "점수 입력 >>>");
				scores[i][j] = sc.nextInt(); 
				// 각각의 점수: scores[i][j]
				// 과목의 합계: scores[names.length-1][j]
				// 학생의 합계: scores[i][subjects.length-1]
				// 전체의 합계: scores[names.length-1][subjects.length-1]
				scores[names.length-1][j] += scores[i][j]; // 학생들의 과목별 점수를 합산해준다.
				scores[i][subjects.length-1] += scores[i][j]; // 과목별 학생들의 점수를 합산해준다.
				scores[names.length-1][subjects.length-1] += scores[i][j]; // 학생합산과 과목별 합산을 합산해준다.
				
			}
		}
		
		// 출력
		
		// 제목 출력
		System.out.print("\t"); // "\t" = 한글로 따지면 4글자 이다.		
		for(String subject : subjects) {
			System.out.print(subject + "\t");
		}
		System.out.println();
		
		// 본문 출력
		for(int i = 0; i < scores.length; i++) {
			System.out.print(names[i] + "\t");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
		
		
		
		
		
		
		
		

	}

}
