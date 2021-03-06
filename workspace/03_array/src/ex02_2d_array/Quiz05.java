package ex02_2d_array;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		// 영한사전
		// "영어단어"와 "의미"를 배열에 저장해 두고, 
		// 묻고 답하는 프로그램
		// 봄을 영어로하면? >>> spring
		// 정답
		// 여름을 영어로하면? >>> suummer
		// 오답
		// 가을을 영어로하면? >>> fall
		// 정답
		// 겨울을 영어로하면? >>> winder
		// 오답
		// 2문제를 맞히고, 2문제를 틀렸습니다.

		
		Scanner sc = new Scanner(System.in);
		
		String[][] dict = {
				 		{"봄" , "spring"},	// dict[0][0], dict[0][1]
				 		{"여름", "summer"},	// dict[1][0], dict[1][1]
				 		{"가을", "fall"},		// dict[2][0], dict[2][1]
				 		{"겨울", "winter"} 	// dict[3][0], dict[3][1]
							}; 				// dict[i][0], dict[i][1]
		
		int wrong = 0; // 틀린 문제의 갯수
		
		/*
		// 필요 변수 생성
		String[] kor = {"봄", "여름", "가을", "겨울"};
		String[] eng = {"spring", "summer", "fall", "winter"};
		
		// 입력부 생성
		for(int i = 0; i < kor.length; i++) {
			System.out.println(kor[i] + "를 영어로하면? >>>");
			String as = sc.next();			
		if(as == eng[i]) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		}
		*/
		
		
		// 선생님이 푼 해답)
		for (int i = 0; i < dict.length; i++) {
			System.out.println(dict[i][0] + "을 영어로 하면? >>>");
			String answer = sc.next();
			if(answer.equalsIgnoreCase(dict[i][1])) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
				wrong++;
			}
		}
		System.out.println((dict.length - wrong) + "문제를 맞히고, " + wrong + "문제를 틀렸습니다.");
		sc.close();
		
		
		// 문제에 대한 내생각)
		// 1. 문제에 대한 해석이 모자랐다.
		// 2. 필요한 변수인지 아닌지 결정
		// 3. 문자열의 동등비교는 ==이 아닌 equals를 사용해야 된다.
		// 4. 배열의 패턴을 이용하여 [i],[j]의 사용 유무를 결정해야된다.
	}

}
