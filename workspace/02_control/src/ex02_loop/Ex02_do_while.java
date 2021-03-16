package ex02_loop;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		
		// do - while 문
		// 1. 기본적으로는 while문이다.
		// 2. 반드시 한 번은 실행하는 while문이다.
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int n = 0;
		
		do {
			System.out.print("양수만 입력>>>");
			n = sc.nextInt();
			total += n;
		} while (n>=0);
		
		total -= n;
		System.out.println("합계: " + total);
		
		sc.close();
		
		// 최초에 while문으로 진입하기 전에 조건 제약이 없기 때문에 do문에 있는 실행들이 한번은 실행되기 때문에
		// while의 조건인 n>=0 에 영향을 받지않는다.
		
		
		// 자주 사용되진 않지만 while을 사용하는것보다 do-while을 사용하면 편할때가 가끔있어서 알아두면 좋다.
		
		
		
		
		
		
		

	}

}
