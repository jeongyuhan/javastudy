package ex02_operator;

public class Ex02_operator {

	public static void main(String[] args) {
		
		// 4. 관계 연산자 : >, >=, <, <=, ==, !=
		// 결과의 타입은 boolean이다. (ture or false)
		
		int age = 20;
		boolean isAdult = age >= 20 ; // 성인이라면 true, 아니라면 false (기준은 20살)
		System.out.println(isAdult); 
		
		
		// 5. 논리 연산자 : &&, ||, !
		// 대부분 관계 연산자와 함께 사용된다.
		// 1) && : 모든 관계 연산의 결과가 true이면 true, 아니면 false
		// 2) || : 관계 연산의 결과가 하나라도 true이면 true, 아니면 false
		// 3) !  : 관계 연산의 결과를 반대로 변경 
		
		int a = 10;
		int b = 10;
		System.out.println(a == 10 && b == 10); // a도 10이고 b도 10이면 true, 아니면 false 
		System.out.println(a == 10 || b == 10); // 하나라도 만족하면 true
		System.out.println(!(a == 10)); // 연산의 결과를 반대로 하기 때문에 결과는 false
		
		System.out.println(a == 0 && ++b > 0); // false (&& 연산은 false가 나오면 연산을 멈춘다. 어차피 false이기 때문에)
		System.out.println(a); // 10
		System.out.println(b); // 10, (&& 연산이 false값이 나와 연산을 멈추었기 때문에 ++b는 연산되지 않는다.)
		
		System.out.println(a == 10 || b++ > 0); // true (||연산은 true가 나오면 연산을 멈춘다. 어차피 true이기 때문에)
		System.out.println(a); // 10
		System.out.println(b); // 10, (|| 연산이 true값이 나와 연산을 멈추었기 때문에 ++b는 연산되지 않는다.)
		
		
		
		
		
		
		
		
		
		
		
	}

}
