package ex02_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		
		// 무한루프 만들기
		/*while (true) {
			System.out.println("무한루프입니다.");
		}*/

		// 내용물이 여러개인데 내용물의 갯수를 모를 때 while문을 사용한다.
		// 몇개가 저장된지 알면 while문이 아닌 for문을 사용한다.
		
		
		// 1~10 출력
		/*int n = 1;
		while (n <= 10) { // n:1~10인 경우 while(true)
			System.out.println(n++);
		}
		
		// 10~1 출력
		int a = 10;
		while (a >= 1) {
			System.out.println(a--);
		}*/
		
		
		// 'A' ~ 'Z' 사이를 계속 입력 받는 프로그램
		// 대문자가 입력되지 않으면 종료합니다.
		Scanner sc = new Scanner(System.in);
		/*
		
		char ch = 'A';
		
		while (ch >= 'A' && ch <= 'Z') {	//while(ch >= 65 && ch<=90) 연산안에서 문자는 자동으로 코드값으로 인식되어 사용된다.
			System.out.println("대문자를 입력하세요.");
			ch = sc.next().charAt(0);
		}*/
		// 대문자를 입력하면 계속해서 진행되지만 대문자이외에 다른것을 입력하면 종료된다.

		
		// 입력 받은 정수를 모두 더해줍니다.
		// 0 이상은 모두 더해주고, 음수가 입력되면 그만합니다.
		// 합계를 출력해보자.
		/*
		int total = 0;
		
		while (total >= 0) {
			System.out.println("양수를 입력해주세요.");
			total = sc.nextInt();
		}
		*/
		
		
		// 선생님이 푼 해답)
		int total = 0;
		int n = 0; // 최초 while문 진입용도
		
		while (n>=0) {
			System.out.println("양수 입력");
			n = sc.nextInt();
			total += n; // (양수 음수구분없이 더해버린다.)
		}
		
		total -= n; // n이 음수일 때 처리되므로, -=로 처리합니다.
		System.out.println("합계는 " + total + "입니다.");
		
		sc.close();

		// 문제에 대한 내생각)
		// 1. 변수 설정에 대한 필요성. 왜 total변수와 n변수 두가지가 설정되어야 하는가에 대한 생각해보기
		// 2. +=,-= 의 자연스러운  사용법 익히기
		
		
		// while문은 언제 끝날지 모를 때 사용한다.(횟수가 정해져있지 않은 경우)
		
			
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
