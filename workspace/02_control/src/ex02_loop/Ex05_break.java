package ex02_loop;

import java.util.Scanner;

public class Ex05_break {

	public static void main(String[] args) {
		
		// break문 
		// 1. switch문을 종료시킬 때 사용하였다.
		// 2. loop문을 종료시키는 용도로도 사용할 수 있다.
		
		// 주요 사용
		// 무한루프 + break문 
		
		// 무한루프 만드는 방법
		// 1. while (true){  } -- 무한루프의 경우 while문 추천
		// 2. for ( ; ; ) {  }
		
		// 무한루프를 만들고 종료시점을 if문으로 만들어낸후 break를 사용하면 된다.
		Scanner sc = new Scanner(System.in);
		
		String city = null;
		
		while (true) {
			System.out.println("대한민국의 수도는?>>>");
			city = sc.next();
			
			if (city.equals("서울") || city.equalsIgnoreCase("seoul")) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("오답입니다.");
			}
		}
		// 위와같이 사용하면 가독성이 높아진다.
		sc.close();

		
		// 문제)
		// 1부터 시작하는 모든 정수를 더한다.
		// 합계가 3000이 넘을 때까지 계속한다.
		// 실행 예)
		// 1부터 77까지 더하면 3003이다.
		
		int total = 0;
		int n = 1;
		while (true) {
			total += n;
			if(total > 3000) {
				break;
			}
			n++;
		}
		System.out.println("1부터 " + n + "까지 합계는 " + total + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
