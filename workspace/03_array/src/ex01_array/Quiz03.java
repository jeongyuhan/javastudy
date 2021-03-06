package ex01_array;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 성적 관리 프로그램
		// 학생들의 점수를 입력 받아서,
		// 평균, 최대, 최소 점수를 출력하기
		
		Scanner sc = new Scanner(System.in);
		/*
		String[] students = {"타요", "브레드", "스폰지밥", "짱구", "구하리"};
		int[] scores = new int[students.length];
		
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i] + "의 점수 입력>>>");
			scores[i] = sc.nextInt();
			
		}
		for(int i = 0; i < students.length; i++) {
			double ave = 
			int high = 
			int low = 
			System.out.println("평균: " + ave + "최고점: " + high + "최저점: " + low));
		}
		*/
		
		
		// 선생님이 푼 해답)
		String[] students = {"타요", "브레드", "스폰지밥", "짱구", "구하리"};
		int[] scores = new int[students.length];
		
		// 점수를 입력받는다.
		for(int i = 0; i < scores.length; i++) {
			System.out.println(students[i] + "의 점수 입력>>>");
			scores[i] = sc.nextInt();
		}
		
		// 평균(합계/갯수), 최소, 최대값을 저장할 변수 선언하고, 초기화를 진행한다.
		// 첫 번째 학생의 점수가 초기화 값으로 사용
		int total = scores[0];
		int min = scores[0];
		int max = scores[0];
		String top = students[0];
		String bottom = students[0];
		
		// 첫 번째 학생의 점수를 제외하고 합계, 최소, 최대값을 구한다.
		// 인덱스를 1부터 사용하겠다는 의미
		for(int i = 1; i < scores.length; i++) {
			total += scores[i]; // 첫 번째 학생의 점수로 초기화 되어있는 total에 두 번째 학생의 점수부터 마지막 학생의 점수까지 더해주는 합계
			
			if(min > scores[i]) { // 현재 저장된 최솟값보다 작은 점수가 나타난다면 이라는 의미
				min = scores[i]; // 작은 점수를 최솟값으로 갱신하여 사용한다. 이라는 의미
				bottom = students[i]; // 갱신된 최소점수의 학생 이름 표현
			} 
			
			if(max < scores[i]) { //현재 저장된 최댓값보다 큰 점수가 나타난다면 이라는 의미
				max = scores[i]; // 큰 점수를 최댓값으로 갱신하여 사용한다. 이라는 의미
				top = students[i]; // 갱신된 최대점수의  학생 이름 표현
			}
		}
		
		// 결과를 출력
		System.out.println("평균: " + ((double)total / scores.length) + "점");
		
		System.out.println("최소: " + min + "점" + "(" + bottom + ")");
		
		System.out.println("최대: " + max + "점" + "(" + top + ")");
	
		sc.close();
		
		// 문제에 대한 내생각)
		// array 패키지에 Ex03번을 자세히 익혀야한다. 
		// 필요한 변수 설정
		// int total = scores[0];
		// int min = scores[0];
		// int max = scores[0];
		// String top = students[0];
		// String bottom = students[0];
		// 위 변수들의 초기화값을 첫 번째 인덱스의 값으로 하여금 비교코드를 만들기 쉽게 설정
		
	}

}
