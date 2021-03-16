package ex02_loop;

public class Ex07_label {

	public static void main(String[] args) {
		
		// label
		// 1. 소스코드의 특정 위치를 지정하는 방법이다.
		// 2. 방법 
		//    label: 소스코드
		
		
		// 구구단 출력
		// 5 x 5 = 25 까지만 출력할 때
		
		// 라벨이 있을 때
		outer: for(int dan = 2; dan <= 9; dan++) {
			inner: for(int n = 1; n <= 9; n++) {
				System.out.println(dan + " x " + n + " = " + (dan*n));
				if(dan == 5 && n ==5) {
					break outer; // outer의 for문을 종료시킨다.
				}
			}
		}
		
		
		/*
		//라벨이 없을 때
		for(int dan = 2; dan <= 9; dan++) {
			int n;
			for (n = 1; n <= 9; n++) {
				System.out.println(dan + " x " + n + " = " + (dan*n));
				if(dan == 5 &&  n == 5) {
					break; //내부for문만 끝내는 break
				}
			}
			if(dan == 5 && n == 5) {
					break;
			}
		}	
		*/
		
		
		
		
		
		
		
		
		
		
	}

}
