package ex03_input;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		// 5. 성별을 의미하는 숫자 (1~4)를 입력받아서 "남", "여" 구분출력하기
		// 1,3 은 남자 2,4는 여자
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민 번호 뒷자리 첫번째 숫자를 입력해주세요");
		int no = sc.nextInt();
		
		double result = no % 2;
		String gender = result =   ? "남" : "여";
		System.out.println(gender);
		*/
		
		// 선생님이 푼 해답)

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력");
		int iGender = sc.nextInt();
		
		// 방법 1. 
		// String gender = (iGender == 1 || iGender == 3) ? "남자" : "여자";
		
		// 방법 2.
		String gender = (iGender % 2 == 1) ? "남자" : "여자"; // 나머지 연산으로 홀수와 짝수를 구분지어 비교 사용
		System.out.println("성별은 " + gender + "입니다.");
		
		sc.close();
		
		
		// 오답노트)
		// 1. 타입의 적절한 설정하기
		// 2. 삼항 연산자 코드 적절하게 작성하기
		
		

	}

}
