package ex01_random;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		// UpDown게임
		// 1 ~ 10000 사이의 난수가 발생되면 사용자가 해당 난수를 맞추는 게임
		// 입력 >>> 5000
		// Up (UP일 경우 5000보다 큰 숫자를 입력하라는 의미)
		// 입력 >>> 7500
		// Down 
		// 입력 >>> 7499
		// 총 3번만에 정답입니다.
		
		Scanner sc = new Scanner(System.in);
		int top = 10000;
		int bottom = 1;
		int rand = (int)(Math.random() * top) + bottom; //난수 발생
		int n = 0; //사용자 입력 값
		int times = 0; //입력 횟수
		
		do {
			// 입력
			System.out.println("입력 >>>");
			n = sc.nextInt();
			times++;
			// 입력 범위 체크
			if(n > top || n < bottom) {
				System.out.println(bottom + "~" + top +"범위를 입력하세요.");
				continue; // 위와같이 실행되었을시 아래코드를 실행하지 않고 다시 입력으로 돌려보낸다.(continue의 성질)
			}
			// 비교
			if(n == rand) {
				System.out.println("총" + times + "번 만에 정답입니다.");
			} else if(n < rand) {
				System.out.println("Up");
				bottom = n + 1;
			} else {
				System.out.println("Down");
				top = n - 1;
			}
			
		} while(rand != n); // 맞추지 못하면 계속하라는 의미
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}

}
