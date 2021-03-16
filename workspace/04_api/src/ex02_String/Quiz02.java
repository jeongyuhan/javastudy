package ex02_String;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// 정수, 실수 판별하기
		// 입력 >>> 120
		// 120은 정수입니다.
		// 입력 >>> 3.14
		// 3.14는 실수입니다.
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("입력");
		int a = sc.nextInt();
		
		if(a >= 0.0) {
			System.out.println(a + "는(은) 실수입니다.");
		} else {
			System.out.println(a + "는(은) 정수업니다.");
		}
		*/
		
		// 선생님이 푼 해답)
		System.out.println("입력");		
		String input = sc.next();
		
		if(input.indexOf(".") == -1) { // "."가 인덱스에 존재하지 않으면이라는 의미
			System.out.println("정수입니다.");
		} else {
			System.out.println("실수입니다.");
		}
		sc.close();
		
		
	}

}
