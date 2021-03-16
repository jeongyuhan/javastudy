package ex02_loop;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 영화 평점을 입력받아서 ★을 출력하시오.
		// 평점은 1~5 사이의 정수이고, 잘못된 평점은 다시 입력 받으시오.
		
		Scanner sc = new Scanner(System.in);
		/*int n = 0;
		do {
			for (int a = 1; a <= 5; a++) {
				a = n;
				if(a!=n) {
					System.out.println("평점을 다시 입력하세요.");				}
			}
			System.out.println("평점을 입력하세요.");
			
		} while(n==1&&n==2&&n==3&&n==4&&n==5);
		*/
		
		// 선생님이 푼 해답)
		// 1. do-while문을 이용해서 잘못된 평점을 받을시 다시 입력받는 구문을 만든다.
		int grade = 0; //평점
		
		do {
			System.out.println("평점을 입력하세요.");
			grade =sc.nextInt();
		} while (grade <1 || grade >5);
		
		// 2. 평점수만큼 별의 갯수를 달아주는 구문을 만든다.  
		String stars = ""; // 빈 문자열("")은 문자열 연결 연산(+)의 경우에 초기화로 사용한다.
		                   // 초기화를 null로 할 경우 문자열 연결 연산시에 null을 값으로 인식한다.
		for(int n = 0; n < grade; n++) {
			stars += "★";
		}
		System.out.println("평점: " + grade + "(" + stars + ")");
		
		sc.close();
		
		
		// 문제에 대한 내생각)
		// 1. 변수를 정하고 초기화 시키는 연습.
		// 2. 명령문을 조합하는 방법 연습.
		// 3. 조건식의 형태 연습.
		
		
		
		

	}

}
