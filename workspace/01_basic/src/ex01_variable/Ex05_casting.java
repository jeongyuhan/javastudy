package ex01_variable;

public class Ex05_casting {

	public static void main(String[] args) {
		
		// casting : 다른 타입(자료형)으로 변환하는 것
		
		// 자동 형변환 (promotion)
		System.out.println(1 + 1.5); // 1 + 1.5 -> promotion으로 1.0 + 1.5로 변환시킨다.
		
		// 강제 형변환 (casting) 
		int a = 1;
		double b = 1.5;
		System.out.println(a + (int)b); // b를 잠시 int형으로 변환
		// 강제 형변환 (casting) 방법
		// (변환시킬 타입)변수;
		// 강제 형변환 할 때 데이터의 훼손이 일어날 수 도 있다.
		// 강제 형변환은 잘못되었더라도 개발자가 실행한대로 행해진다.
	
		
	}

}
