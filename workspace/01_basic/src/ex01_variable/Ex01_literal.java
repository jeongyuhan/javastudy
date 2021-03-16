package ex01_variable;

public class Ex01_literal {

	public static void main(String[] args) {
		
		// 1. 정수 표현법    : 그냥 입력한다.
		// 정수의 범위
		System.out.println(Integer.MAX_VALUE); // 최대범위
		System.out.println(Integer.MIN_VALUE); // 최소범위
		System.out.println(2147483647); // int범위는 그냥 사용하면된다.
		System.out.println(2147483648L); // int범위를 벗어나면 접미사 L 을 붙여서 사용한다. (L은 long의 약자이다. long 타입은 int의 범위의 2배이다.)
		 
		// 2. 실수 표현법    : 그냥 입력한다.
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		// 결과
		// 1.7976931348623157E308 : 1.7976931348623157 곱하기 10의 308제곱
		// 4.9E-324 : 4.9 곱하기 10의 -324제곱
		
		// 3. 문자 표현법    : 작은 따옴표(')로 묶는다.
		System.out.println('A');
		System.out.println('한');
		
		// 4. 문자열 표현법 : 큰 따옴표(")로 묶는다.
		System.out.println("안녕하세요");
		
		// 5. 논리 표현법    : true 또는 false
		System.out.println(true);
		System.out.println(false);

	}

}
