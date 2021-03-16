package ex03_input;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		// 4. int 타입의 매출액 + 등급("VIP","일반") 입력 받아서 실매출액 출력하기
		//    "VIP"는 20%  할인 , "일반"은 5% 할인    
		/*
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("매출액을 입력해주세요");
		int m = sc.nextInt();

		System.out.println("등급을 입력해주세요");
		String lv = sc.next();
		
		int vipDc = m - (int)(m * 0.2);
		int nomDc = m - (int)(m * 0.05);
		*/
		
		
		// 선생님이 푼 해답)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("매출액");
		int salesMoney = sc.nextInt();
		
		System.out.println("등급");
		String grade = sc.next();
		
		//double disCountRate = grade.equals("VIP") ? 0.2 : 0.05; VIP를 대소문자 구분을 무시해도 가능하도록 바꾸려면 아래와 같이 바꾸면된다.
		double disCountRate = grade.equalsIgnoreCase("VIP") ? 0.2 : 0.05; //Ignore 는 대소문자를 무시해도 가능하도록 해주는 메소드이다.
		
		salesMoney -= (salesMoney * disCountRate); // (salesMoney * disCountRate)에서 프로모션이 이뤄지고 있다 소수점을 잘라내서 결과를 출력해준다.
		
		System.out.println("실 매출액: " + salesMoney);
		
		sc.close();
		
	
		// 오답노트)
		// 1. grade == VIP  불가능하다. 문자열 비교는 =부호 사용불가  
		//    grade.equals("VIP") 문자열의 비교는 equals를 사용해야한다.
		// 2. 필요한 변수 설정 꼼꼼하게 설정하기.
	}

}
