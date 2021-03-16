package ex03_input;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		// 7. 체질량지수 구해서 건강상태 출력하기
		//    double 타입의 몸무게와 키를 입력하여 구하라. (체질량 지수 = 몸무게/키(단위:m)의 제곱)
		//    건강상태 = 25이상 "과체중", 24~20 "정상", 19이하 "저체중"

		
		// 선생님이 푼 해답)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몸무게 입력");
		double weight = sc.nextDouble();
		
		System.out.println("키 입력");
		double height = sc.nextDouble();
		
		height /= 100; // 키가 185.5cm 일 경우 1.855m로 바꿔준다. 
		
		double bmi = weight / Math.pow(height, 2); // 제곱을 구해주는 메소드() = Math.pow()
		
		String healthCondition = (bmi >= 25) ? "과체중" : (bmi >= 20) ? "정상" : "저체중";
		// 삼항 연산자 안에 삼항연산자를 추가해 3가지 요건을 모두 충족시켜준다.
		
		System.out.println("체질량지수: " + bmi + "(" + healthCondition + ")");
		
		sc.close();
		
		
		// 오답노트)
		// 삼항 연산자 안에 삼항 연산자가 들어가는 코드를 자세히보기.
		// 풀지 못한 문제이므로 정확하게 다시보기.
		
				
		
		
		
		
	}

}
