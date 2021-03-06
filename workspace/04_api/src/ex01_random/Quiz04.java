package ex01_random;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		// 가위바위보
		// 가위바위보 >>> 가위
		// Plater는 가위, Computer는 보, 이겼습니다.
		// 가위바위보 >>> 바위
		// Plater는 바위, Computer는 바위, 비겼습니다.
		// 가위바위보 >>> 보
		// Plater는 보, Computer는 가위, 졌겼습니다.
		// 1승 1무입니다.
		
		
		/*
		Scanner sc = new Scanner(System.in);
		String[] gababo = {"가위", "바위", "보"};
		
		while(true) {
			System.err.println("가위바위보 >>>");
			String user = sc.next();
			
			
			int computer = (int)(Math.random() * 3) + 0; //gababo 배열의 인덱스 
			System.out.println(gababo[computer]); // Computer가 무엇을 냈는지 출력할 수 있다.
			
			
		}
		*/
		
		
		// 선생님이  푼 해답)
		Scanner sc = new Scanner(System.in);
		String[] gababo = {"가위", "바위", "보"};
		
		int win = 0;	// 이긴 횟수
		int draw = 0;	// 비긴 횟수
		
		loop:
		while(true) {
			System.out.println("가위바위보 >>>");
			// 가위, 바위, 보 를 정수 0, 1, 2로 바꿔준다 
			int player = 0; // 초기화로 가위
			switch(sc.next()) {
			case "바위":
				player = 1;
				break;
			case "보":
				player = 2;
			}
			System.out.print("Player는 " + gababo[player]);
			
			int computer = (int)(Math.random() * 3) + 0; //gababo 배열의 인덱스 
			System.out.print(", Computer는 " + gababo[computer]);
			
			// player : 0, 1, 2
			// computer : 0, 1, 2
			// diff = player - computer
			// 1. 이긴 경우	: diff = -2, 1
			// 2. 비긴 경우	: diff = 0
			// 3. 진 경우	: diff = 이외의 값
			switch(player - computer) {
			case -2: case 1:
				System.out.println(", 이겼습니다.");
				win++; // 이긴 횟수 추가
				break;
			case 0:
				System.out.println(", 비겼습니다.");
				draw++; // 비긴 횟수 추가
				break;
			default:
				System.out.println(", 졌습니다.");
				break loop; // label을 이용해서 while문을 끝내준다.
			}		
		}
		
		System.out.println(win + "승" + draw + "무");
		sc.close();
		
		// 문제에 대한 내생각)
		// 승무패를 만드는 방법에 대해 생각해보자.
		
		
		
	}

}
