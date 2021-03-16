package ex01_random;

public class Ex02_Math {

	public static void main(String[] args) {
		
		// java.lang.Math
		
		System.out.println(Math.random());	// 0.0 <= Math.random() < 1.0
		
		// Math.random()의 결과가 0.1보다 작을 확률은 얼마일까? 10% 
		// Math.random()의 결과가 0.2보다 작을 확률은 얼마일까? 20%
		
		// 10% 확률로 "강화 성공", 90%확률로 "강화 실패"
		if (Math.random() < 0.1) {
			System.out.println("강화 성공");
		} else {
			System.out.println("강화 실패");
		}
		
		
		// Math.random()				0.0 <= random < 1.0
		// Math.random() * 3        	0.0 <= random < 3.0
		// (int)(Math.random() * 3)   	  0 <= random < 3  
		// (int)(Math.random() * 3) + 1	  1 <= random < 4 	
		
		// 일반화(공식처럼 활용)
		// 원하는 난수의 범위를 만드는 방법
		// (int)(Math.random * 개수) + 시작값 
		
		// 주사위	: (int)(Math.random() *  6 ) + 1  
		// 로또	: (int)(Math.random() * 45 ) + 1
		int lotto = (int)(Math.random() * 45 ) + 1;
		System.out.println(lotto);
		
		
		
		
		
		

	}

}
