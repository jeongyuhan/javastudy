package ex03_api;

public class Ex06_wrapper_class {

	public static void main(String[] args) {
		
		/*
		 	wrapper class
		 	1. primitive type -> reference type 으로 변경해주는 클래스이다.
		 	2. 변수 -> 객체 로 변경하는 클래스이다.
		 	3. 종류
		 		primitive	->		reference
		 		1) int		->		Integer
		 		2) long		->		Long
		 		3) double	->		Double
		 		4) char 	->		Character
		 		5) boolean 	->		Boolean
		 	4. 용어
		 		1) Auto Boxing	 : primitive 값 -> reference 객체 (값을 객체로 만드는 것)
		 		2) Auto UnBoxing : reference 객체 -> primitive 값 
		 */

		Integer a = new Integer(10);
		Integer b = new Integer("20");
		Integer c = 30;  // AutoBoxing
		
		int total = a + b + c; // AutoUnBoxing
		
		System.out.println(total);
		
		
		
	}

}
