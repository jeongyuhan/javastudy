package ex01_variable;

public class Ex06_parsing {

	public static void main(String[] args) {
		
		/* String 타입 변환은 parsing이다.
		
		int a = 10;
		 System.out.println((String)a); - 일반적인 casting으로는 안된다.
		
		String b = "10";
		 System.out.println((int)b); - casting이 안된다.
		
		 String 타입은 casting이 안된다.
		*/
		
		// 1. 정수 int를 문자열 String으로 변환하기
		//    (모든 타입은 같은 방법을 사용한다.)
		int a = 10;
		String a1 = String.valueOf(a);
		String a2 = "" + a; // 문자열의 + 연산은 연결이다. 결과도 문자열이다.
		                    // 따라서, 이러한 특징을 사용하여 자동 형변환을 이용하여 "문자열 + 정수 = 문자열" 의 형태를 만들어준다.
		System.out.println(a1);
		System.out.println(a2);
		
		// 2. 문자열 String을 정수 int로 변환하기
		String b = "123";
		int bb = Integer.parseInt(b); 
		System.out.println(bb);
		
		// 3. 문자열 String을 실수 double로 변환하기
		String c = "1.5";
		double cc = Double.parseDouble(c);
		System.out.println(cc);
					
		
	}

}
