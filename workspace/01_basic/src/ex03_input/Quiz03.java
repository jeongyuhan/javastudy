package ex03_input;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 3. 나이를 입력 받아서 "성인", "미성년자" 구분하기(20살 기준)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		
		String adult = age >= 20 ? "성인" : "미성년자";
		System.out.println(adult);
		
		
		// 선생님이 푼 해답)
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이입력");
		int age = sc.nextInt();
		
		System.out.println(age >= 20 ? "성인" : "미성년자");
		
		sc.close();
		*/
		
		// 오답노트)
		// 1. 삼항연산자는 syso에서 바로 사용가능하다.
		// 2. close() 사용주의
		
				
		
	}

}
