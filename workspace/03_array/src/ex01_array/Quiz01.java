package ex01_array;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 문제)
		// 길이가 3인 String타입의 배열을 선언하고, 
		// 3개의 이름을 입력 받아서 배열에 저장하고 확인하기
		
		Scanner sc = new Scanner(System.in);
		/*
		String[] sarr = new String[3];
		
		for(String n : sarr) {
			System.out.println("이름입력>>>");
			String name = sc.next();
			sarr[3] = name;
		}
		*/
		
		
		// 선생님이 푼 해답)
		String[] names = new String[3];
		
		for(int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + "번째 이름 입력>>>" );
			names[i] = sc.next();
		}
		for(String name : names) {
			System.out.println(name);
		}
		sc.close();
		
		// 문제에 대한 내생각)
		// 1. 배열 생성후 입력받는 코드먼저 작성
		// 2. 출력하는 코드는 향상for문으로 따로 작성해야 
		//    그때그때 실행되는 것이 아니라 입력받은 내용을 한번에 묶어서 출력해준다.
		
		
	}

}
