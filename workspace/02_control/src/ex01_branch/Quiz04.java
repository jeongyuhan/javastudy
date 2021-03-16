package ex01_branch;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		/* 4. swich사용
		   단계를 숫자로 입력받아 구분 출력
		   1 입력 : 기승전결
		   2 입력 : 승전결
		   3 입력 : 전결
		   4 입력 : 결
		   나머지입력 : 알 수 없음
		*/
		
		// 선생님이 푼 해답)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단계(1~4)입력");
		int step = sc.nextInt();
		
		switch (step) {
		case 1: System.out.println("기");
		case 2: System.out.println("승");
		case 3: System.out.println("전");
		case 4: System.out.println("결");
			break;
		default: System.out.println("알 수 없음");	
		}
		sc.close();
		
		// 해결 Tip)
		// 앞쪽 break를 생략해 입력한 숫자가 있는 case부터 break가 있는 곳까지 실행이 이어질 수 있도록 설정해놓는다.
		// break를 생략하여 사용하는 활용법을 고민해보기.
		
		
	}

}
