package ex01_branch;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 1. 임의의 양수 1개 입력 받아서 "홀수" , "짝수" , "3의배수" 출력
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		
		if(a % 2 == 1) {
			System.out.println("홀수");
		} else if (a % 2==0) {
			System.out.println("짝수");
		} else  (a % 3 ==0) {
			System.out.println("3의배수");
		} 
		*/
		
		
		// 선생님이 푼 해답)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양수를 입력하세요");
		int n = sc.nextInt();
		
		if (n % 3 == 0) {
			System.out.println(n + "은 3의배수입니다.");
		} else if (n % 2 == 0) {
			System.out.println(n + "은 짝수입니다.");
		} else {
			System.out.println(n + "은 홀수입니다.");
		}
		sc.close();
		
		
		//오답노트)
		// 1. 3의배수를 먼저 처리해야한다.
		//    그렇지않으면 짝수와 홀수 처리로 넘어가 버리기 때문에 3의배수 출력이 불가능하다.
		
		
		
		
		
	}

}
