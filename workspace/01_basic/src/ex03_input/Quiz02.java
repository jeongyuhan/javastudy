package ex03_input;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 2. double 타입의 실수 2개 입력 받아서 값을 교환하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 실수를 입력해주세요");
		double s1 = sc.nextDouble();
		System.out.println("두번째 실수를 입력해주세요");
		double s2 = sc.nextDouble();
		
		double x = s1;
		s1 = s2;
		s2 = x;
		System.out.println("첫번째 실수: " + s1);
		System.out.println("두번째 실수: " + s2);
		
		// 선생님이 푼 해답)
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 실수");
		double a = sc.nextDouble();

		System.out.println("두번째 실수");
		double b = sc.nextDouble();
		
		double temp = a;
		a = b;
		b = temp;
		
		System.out.println("a=" + a + ", b=" + b);
		
		sc.close();
		*/
		
		// 오답노트)
		// 1. syso 한곳에 출력메세지 작성하기.

	}

}
