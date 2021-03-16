package ex02_loop;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		// 10000원 모두 사용하기
		// 현재 10000원이 있다.
		// 결제금액 >>> 5000
		// 현재 5000원이 있습니다.
		// 결제금액 >>> -100
		// -100은 결제할 수 없습니다.
		// 현재 5000원이 있습니다.
		// 결제금액 >>> 10000
		// 5000원이 부족합니다.
		// 현재 5000원이 있습니다.
		// 결제금액 >>> 5000
		// 현재 0원이 있습니다.
		// 더이상 진행 안되게 종료
		
		Scanner sc = new Scanner(System.in);
		/*
		
		int money = 10000;	
		int pay = 0;
		while (true) {
			if(money == 0) {
				break;
			}
			System.out.println("결제금액>>>");
			if(pay >= 0) {
				pay = sc.nextInt();
				money -= pay;
				System.out.println("현재" + money + "원이 있습니다." );
			} else {
				System.out.println(pay + "원은 결제할 수 없습니다.");
				break;
			}
		}
		*/
		
		
		// 선생님이 푼 해답)
		int money = 10000;
		
		while (true) {
			System.out.println("현재" + money + "원이 있습니다.");
			if(money == 0) {
				break;
			}
			System.out.println("결제금액>>>");
			int spend = sc.nextInt();
			
			if(spend < 0) {
				System.out.println(spend + "원은 결제할 수 없습니다.");
			} else if (spend > money) {
				System.out.println((spend-money) + "원이 부족합니다.");
			} else {
				money -= spend;
			}
			
		}
		
		sc.close();
		
	}

}
