package ex02_loop;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 비밀번호를 "asdf"로 가정한 후
		// 비밀번호를 입력받아서 일치하면 "로그인되었습니다."
		// 일치하지 않으면 "비밀번호를 확인하세요."
		// 최대 5번만 입력을 받을 수 있다.
		// 5번 실패하면 "비밀번호 입력 횟수를 초과했습니다."
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("비밀번호를 입력하세요");
		String pw = "asdf";
		pw = sc.next();
		int chance = 0;
		while(true) {
			if(pw.equalsIgnoreCase("asdf")) {
				System.out.println("로그인되었습니다.");
				break;
			} else {
				System.out.println("비밀번호를 확인하세요.");
			}
		}
		*/
		
		
		// 선생님이 푼 해답)
		int count = 0;
		while (true) {
			if(count ==5) {
				System.out.println("비밀번호 입력 횟수를 초과했습니다.");
				break;
			}
			System.out.println("비밀번호 입력 >>>");
			String pw = sc.next();
			count++;
			if(pw.equals("asdf")) {
				System.out.println("로그인되었습니다.");
				break;
			} else {
				System.out.println("비밀번호를 확인하세요.");
			}
		}
	
		
		// 문제에 대한 내생각)
		// 1. 실행 순서에 따라 어떻게 코드를 짜야할지 생각하는 능력 기르기.
		// 2. while문 안에 2개의 if문이 들어가도 된다.
		
		
		
		
		
		
		
		
		sc.close();
		
		

	}

}
