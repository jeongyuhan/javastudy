package ex02_operator;

public class Ex03_operator {

	public static void main(String[] args) {
		
		// 6. 조건 연산자 (삼항 연산자)
		// 조건식? true일 때 : false일 때;   (if의 연산자 버전이라고 보면 이해하기 쉽다.)
		
		int score = 60;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		
		// 문제1) 평균이 85점 이상거나, 국어와 영어 점수가 모두 80점 이상이면 "합격", 아니면 "불합격"
		int kor = 80;
		int eng = 90;
		
		// 내가 푼 해답)
		String jumsu = (kor + eng) / 2 >= 85 || (kor >= 80 && eng >= 80) ? "합격" : "불합격"; 
		System.out.println(jumsu);
		
		// 선생님이 푼 해답)
		boolean isPass = ((kor+eng)/2 >=80) || (kor >= 80 && eng >= 80); // 평균 구하기를 무조건 하는 버전
		System.out.println(isPass ? "합격" : "불합격");
		//boolean isPass =(kor >= 80 && eng >= 80) || ((kor+eng)/2 >=80); //평균구하기를 안 할 수도 있는 버전 
		// 문제2) 2자리(10~99) 정수 중에서 하나를 임의로 선언하고, 그 값이 '카프리카 수' 이면 "맞다", 아니면 "아니다" 
		// 45, 55, 99가 카프리카 수이다.
		int n = 45;  // 45 * 45 -> 2025 -> 20  25 로 쪼갠다. -> 각각을 더해라 20+25 -> 결과가 자신이 되는 수를 '카프리카 수' 라고한다.
		
		// 해답)
		int square = n * n; 
		int front = square / 100; // 앞 두자리를 몫으로 구해준다.
		int end = square % 100;   // 뒤 두자리를 나머지로 구해준다.
		boolean isKaprekar = (n == front + end); // 카프리카 수의 성질을 이용한 조건식을 만들어준다.
		System.out.println(isKaprekar ? "맞다" : "아니다");
		
	}

}
