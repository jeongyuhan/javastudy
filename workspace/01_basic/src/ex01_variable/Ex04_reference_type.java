package ex01_variable;

public class Ex04_reference_type {

	public static void main(String[] args) {

		// reference type
		// primitive type을 제외한 모든 type(자료형)
		
		String s1 = "apple";
		String s2 = new String("apple");
		
		// s1에 저장된 데이터
		// "apple"이 저장되어 있는 메모리 주소값(참조값)이 저장되어 있다.
		
		// s1과 s2는 같은 내용이 저장되었지만 주소값이 다르다.
		// 따라서 아래와 같이 같은지를 비교하면 false가 나온다.
		System.out.println(s1 == s2); // 두 "apple"는 저장된 주소가 다르다.

		
	}

}
