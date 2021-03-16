package ex01_branch;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		/* 2. 나이를 입력받아서 구분출력
		   7세이하 : "미취학아동"
			   13세이하 : "초등학생"
			   16세이하 : "중학생"
			   19세이하 : "고등학생"
			   20세이상 : "성인"
			  나이 범위(1~100)를 벗어나면 : "불가능한 나이"
 		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		if (age<=13) {
			System.out.println("초등학생");
		} else if(age <= 16) {
			System.out.println("중학생");
		} else if(age <= 19) {
			System.out.println("고등학생");
		} else if(age >=20) {
			System.out.println("성인");
		} else { 
			System.out.println("불가능한 나이");
		}
		*/
		
		// 선생님이 푼 해답)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		if(age < 1 || age > 100) {
			System.out.println(age + "살은 불가능한 나이입니다.");
		} else if (age <= 7) {
			System.out.println(age + "살은 미취학 아동입니다.");
		} else if (age <= 13) {
			System.out.println(age + "살은 초등학생입니다.");
		} else if (age <= 16) {
			System.out.println(age + "살은 중학생입니다.");
		} else if (age <= 19) {
			System.out.println(age + "살은 고등학생입니다.");
		} else {
			System.out.println(age + "살은 성인입니다.");
		}
		sc.close();
		
		
		
		
		
		
		
	}

}
