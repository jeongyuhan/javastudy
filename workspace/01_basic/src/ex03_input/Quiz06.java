package ex03_input;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		// 6. 주민번호(하이픈없이) 전체 입력받아서 "남", "여" 구분출력하기
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요");
		int pNO = sc.nextInt();
		*/
		
		// 선생님이 푼 해답)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호입력(하이픈 없이)");
		// 13자리의 주민번호를 입력받는 방법으로는
		// long타입으로 받는 방법과 String으로 받는 방법이있다.
		String id = sc.next();
		
		char genderNum = id.charAt(6);
		
		String gender = (genderNum == '1' || genderNum == '3') ? "남자" : "여자";
		
		/*String gender = (genderNum % 2 == 1) ? "남자" : "여자"; 
		  char 타입의 genderNum를 나머지연산이 가능한가? 
		    문자는 코드값을 가지고있다. 
		    문자를 연사나는 경우 "코드값"이 연산된다.
          '1' % 2 --> 49 % 2 의 연산과 같다. '1'의 숫자 코드값은 49이다.
	      '2' % 2 --> 50 % 2 의 연산과 같다.
	            다시말해 위 와같은 코드는 운이좋아서 맞게 연산되는 것이다.
	      --------------------------------------------------
	            알아두면 좋은 코드 값 (문자의 코드값은 시작으로부터 1씩 증가한다.)
	      '0' = 48
	      'A' = 65
		  'a' = 97 */
		
		System.out.println("성별은 " + gender + "입니다.");
		
		sc.close();
		
		
		// 오답노트)
		// 1. 어떤 타입으로 설정할 것인가를 먼저 정리하기.
		// 2. 주민번호와 같은 길이의 숫자를 long 타입이 아닌 String 타입으로 받아 필요한 숫자인 charAt() 메소드를 적절히 사용하기.
		
	}

}
