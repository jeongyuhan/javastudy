package ex01_random;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
		
		// java.util.Random
		Random random = new Random();
		
		// 1. int 난수
		int rand1 = random.nextInt();	// int 범위 중 하나가 생성된다.
		int rand2 = random.nextInt(10);	// 10개(0~9) 중 하나가 생성된다 
		
		System.out.println(rand1);
		System.out.println(rand2);
		
		// 2. double 난수
		double rand3 = random.nextDouble();	// 생성되는 난수 범위 : 0<= 난수 <1
														  // 0% <= 난수 < 100% // 소수점 난수는 확률에 사용하기 위해 쓰인다.
		System.out.println(rand3);			
		
		
		
		
		
		
		
		
		
		

	}

}
