package ex02_String;

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		
		// java.lang.StringBuilder
		
		// String의 +연산자를 많이 사용하면 성능이 떨어진다.(메모리를 많이 사용한다.)
		// 성능을 올리기 위해서 StringBuilder를 사용한다. 
		
		
		/*
		// 문자열 생성
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		
		// 문자열 추가 (핵심 메소드)
		sb1.append(" ").append("java"); // .append()의 식으로 계속 추가가 가능하다.
		
		System.out.println(sb1);
		 */

		
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		// 문자열 비교
		System.out.println(sb1.equals(sb2)); // String이 아니라서 비교하지 못한다.

		// 문자열로 변환해 보자.(비교를 하기위해 String으로 바꿔준다.)
		// toString() 메소드를 사용하여 변환해준다.
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		System.out.println(str1.equals(str2)); // 이제 비교가 가능해진다.
		
		// 성능을위해 StringBuilder로 만들어주고
		// 완성된후 다시 String으로 변환해 사용해준다.
		
	}

}
