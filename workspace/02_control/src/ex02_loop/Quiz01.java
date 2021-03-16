package ex02_loop;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 1. 퀴즈 맞히기
		// 맞힐때까지 계속 물어보는 퀴즈
		// ex) 대한민국의 수도는?>>> 서울 또는 seoul
		//     정답입니다.
		//     대한민국의 수도는?>>> 인천
		//     오답입니다.

		Scanner sc = new Scanner(System.in);
		/*
		String an1 = "서울";
		String an2 = "seoul";
		
		do {
			System.out.println("대한민국의 수도는?>>>");
			an1 = sc.next();
			an2 = sc.next()
		}
				
		String a = sc.next();
		
		//(a.equals("서울")||a.equals("seoul")) {
		//	System.out.println("정답입니다.");
		*/		
		
		
		// 선생님이 푼 해답)
		String city = null;
		// String city = ""; //String의 초기화 방법 ""빈 문자열 or null
		// while에서 사용하기 위해 선언부를 밖으로 빼놓는다.
		
		do {
			if(city != null) {
			System.out.println("오답입니다.");
			}
			System.out.println("대한민국의 수도는?>>>");
		    city = sc.next();
		} while (!city.equals("서울") && !city.equalsIgnoreCase("seoul")); // 서울||seoul이 아니면 계속 물어본다.
		// 스코프('{','}')의 범위로 인해 do안에 String city = sc.next();를 사용하면 while에서는 city를 알 수가 없다.
		
		System.out.println("정답입니다.");
		
		sc.close();
		
		
		// 문제에 대한 내생각)
		// 1. do-while문을 사용하고, if문을 응용하는 등의 어떤 명령문을 사용할지 선택하는 능력을 기르자.
		// 2. 문제 해결에 필요한 값과 각 명령문에 들어가는 조건식의 형태를 익히자.
		
		
		
		
	}

}
