package ex01_branch;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		// switch사용
		// 나이 입력받아서 "성인" , "미성년자" 출력하기 (20세 기준)
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		int adult = age / 10;
		
		switch(age) {
		
		}
		*/
		
		// 선생님이 푼 해답)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		// switch문의 괄호에 들어갈 정수를 만들어보자.
		int state = 0;
		
		if(age >= 20) {
			state = 1; //성인을 의미
		}
		// switch() 괄호안에들어갈수있는것은 정수 or 문자(열) 이다.
		
		switch(state) {
		case 1: 
			System.out.println("성인");
			break;
		default:
			System.out.println("미성년자");
		}
		
		
		switch(age/10) {
		case 0: // age = 1~9
		//	System.out.println("미성년자");
		//	break;
		//	0일 때 실행문을 지워버리면 자동으로 case 1에 있는 실행문을 출력하기 때문에 겹쳐지는 실행문은 이런식으로 합쳐준다.  
		case 1: 
			System.out.println("미성년자");
			break;
		default:
			System.out.println("성인");
		}
		sc.close();
		
		
		
	}

}
