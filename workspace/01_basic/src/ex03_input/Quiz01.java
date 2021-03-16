package ex03_input;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 1. int 타입의 점수 3개 입력 받아서 평균 구하기
        Scanner sc = new Scanner(System.in);
        
        System.out.println("국어 점수를 입력하세요");
        int kor = sc.nextInt();
        
        System.out.println("영어 점수를 입력하세요");
        int eng = sc.nextInt();
        
        System.out.println("수학 점수를 입력하세요");
        int math = sc.nextInt();
        
        double ave = (kor + eng + math) / 3.0; // 나누기를 3.0이 아닌 3으로 하게되면 소수점이 잘려나간다.
        System.out.println("평균 점수: " + ave);  // (합산이 정수고 나누기를 정수로하면 정수/정수로 인식되기 때문이다.)
        
        
        // 선생님이 푼 해답)
        /*
         Scanner sc = new Scanner(System.in);
         
         System.out.println("국어");
         int kor = sc.nextInt();
         System.out.println("영어");
         int eng = sc.nextInt();
         System.out.println("수학");
         int math = sc.nextInt();
         
         double ave = (kor + eng + math) / 3.0;
         System.out.println("평균: " + ave + "점");
         
         sc. close();
        
         */
        
        // 오답 노트)
        // 1. 평균 점수를 나눌때 3으로 나누면 안된다. 주의할 것.
        // 2. 마지막에 close() 사용하는 습관 만들기
        
        
         
   
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
