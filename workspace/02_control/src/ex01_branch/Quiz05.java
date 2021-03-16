package ex01_branch;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		/*
		 점수를 입력 받아서 해당하는 학점을 출력하시오.
		 char grade : 'S' 'A' 'B' 'C' 'F'
		 char point : '+' '0' '-' ''
		 
		 100   : S
		 99~97 : A+
		 96~94 : A0
		 93~90 : A-
		 89~87 : B+
		 86~84 : B0
		 83~80 : B-
		 79~77 : C+
		 76~74 : C0
		 73~70 : C-
		 69~0  : F
		 */
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int n = sc.nextInt();
		
		int m = n / 10;
		
		if (m == 10) {
			System.out.println("S");
		} else if (m == 9) {
			System.out.println("A");
		} else if (m == 8) {
			System.out.println("B");
		} else if (m == 7) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		
		switch(m) {
		case 10:
		}
		*/
		
		
		// 선생님이 푼 해답)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		// point를 잡아주는 코드 
		// 점수의 뒷자리가 9~7은 +, 6~4는 0, 3~0은 -
		// 나머지를 구해서 낱개로 적어준다.
		char point = '-';
		
		switch (score % 10) {
		case 9: case 8: case 7:
			point = '+';
			break;
		case 6: case 5: case 4:
		    point = '0';
		}
		
		// grade를 잡아주는 코드
		// 10단위 몫에 따라 grade가 달라지므로 몫을구해주는 /를 사용하여 grade를 구분해준다.
		char grade ='F';
		switch(score / 10) {
		case 10: 
			grade = 'S';
			point = ' ';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
			default:
				point = ' ';
		}
				
		System.out.println(""+grade+point); // 빈문자열을 더해줘서 코드값을 더하는 연산이 아닌 문자열을 더하는 연산방식으로 바꿔준다.
		System.out.println(grade+""+point); 
		System.out.println(grade+point+""); // 자바에서는 한번에 3개이상 더하기를 하지못하기 때문에 
		                                    // 앞에 두개의 연산이 먼저된후 마지막 문자열 더하기가 나오므로 문자열이 아닌 코드값 연산이 되어나온다.
		
		sc.close();
		
		// 문제에 대한 내생각)
		// 구성해야되는 점수들의 패턴을 먼저 잘 파악해야될 것 같다.
		// switch문에 대한 이해도가 많이 부족한 것 같다.
		// 어떤상황에서 어떤 문법이 사용되는지 문제를 많이 찾아서 풀어봐야할 것 같다.
		
		
	}

}
