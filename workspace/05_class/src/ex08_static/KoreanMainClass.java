package ex08_static;

public class KoreanMainClass {

	public static void main(String[] args) {

		// 인스턴스 korean1
		Korean korean1 = new Korean();
		
		// 인스턴스 field에 접근
		korean1.name = "홍길동"; // 인스턴스 korean1을 통해서 접근한다.
		
		// 클래스 field에 접근
		System.out.println(korean1.COUNTRY); // 1) 인스턴스로 접근 (추천하지 않는다.)
		System.out.println(Korean.COUNTRY);	 // 2) 클래스로 접근 (일반적인 접근 방식이다.)
		
		
	}

}
