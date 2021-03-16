package ex02_loop;

import java.util.Scanner;

public class Ex06_continue {

	public static void main(String[] args) {
		
		// continue문 
		// 1. loop문으로 되돌아가서 다시 실행한다.
		// 2. continue문 이후의 코드를 실행하지 않기 위해서 사용한다.
		
		/*
		int n = 1;
		while (n <= 10) {
			if (n % 2 == 1) { // 홀수만 출력한다.
				System.out.println(n);				
			}
			n++;
		}
		*/
		// 위의 코드를 continue를 사용하여 만들어보자.
		/*
		int n = 1;
		while(n <= 10) {
			if(n % 2 == 0) { // 짝수는 while문으로 돌려보낸다.
				n++; // 짝수 이더라도 n을 증가시켜야 하므로 continue전에 증가열을 넣어준다.
				continue;
			}
			System.out.println(n);
			n++; // 출력되는 홀수에서도 n을 증가시켜야 하므로 증가열을 홀수 출력  후에 넣어준다.
		}
		
		//for문에 continue사용 (위에서 continue를 사용한 while문과 완벽하게 동일한 코드이다.)
		for(int n = 1; n <= 10; n++) {
			if (n % 2 == 0) {
				continue; // for문은 순서가 중요하다. 본문의 syso과 continue 모두 n++ 부분으로 돌아간다.
			}
			System.out.println(n);
		}
		*/
		
		// 소원을 3개 들어준다.
		// 안 되는 소원은 "로또당첨"이다. 나머지 소원은 모두 들어준다.
		Scanner sc = new Scanner(System.in);
		/*
		
		int count = 0;
		String wish = "";
		wish = sc.next();
		
		while(true) {
			if(count == 3) {
				System.out.println("3가지 소원을 이뤄드렸습니다.");
			}			
			System.out.println("소원을 말하시오.");
			count++;
			if(wish.equals("로또당첨")) {
				continue;
			}
			
		}
		*/
		
		
		// 선생님이 푼 해답)
		int count = 0;
		String wishList = "";
		while(count < 3) {
			System.out.println("소원 입력>>>");
			String wish = sc.next();
			if(wish.equals("로또당첨")) {
				continue; //3번의 카운트 중 "로또당첨"이 있을시에는 카운팅을 하지 않겠다. 
			}
			wishList += wish; // wishList는 입력한 wish가 추가된다.
			count++;
		}
		System.out.println(wishList);
		
		
		sc.close();
		
		
		// 문제에 대한 내생각)
		// 1. 변수의 위치 중요
		// 2. 실행 순서에 대한 정리
		// 3. count의 활용법
		
		
		
		
		
		
		
		
		
		
		
	}

}
