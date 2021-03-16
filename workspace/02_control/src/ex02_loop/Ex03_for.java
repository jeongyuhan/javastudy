package ex02_loop;

public class Ex03_for {

	public static void main(String[] args) {
		
		// for문
		// 1. 반복할 횟수나 범위가 명확할 때 사용한다.
		// 2. 배열이나리스트와 같은 반복가능 객체(iterable)에서 사용한다.
		// 3. 동작 순서
		//    for( ① ; ② ; ④ ) { ③ }
		// ①은 최초 1회만 동작한다.
		// ②, ③, ④는 반복한다.
		
		/*
		// 1 ~ 10 출력
		for(int n = 1; n <= 10; n++) {// for문의 조건식에서 ;는 마침의 역할이 아닌 구분자의 역할을한다.
			System.out.println(n);
		}
		
		// 10 ~ 1 출력
		for(int n = 10; n >= 1; n--) {
			System.out.println(n);
		}
		*/
		
		// 3번 "Hello Java"를 출력하는 for문을 작성해보자.
		for (int n = 0; n < 3; n++) { // 사용되는 n : 0,1,2,
			// 프로그램 언어는 시작을 0으로 잡는게 기본이다.
			// 가독성의 문제로 범위를 n<=2 보다는 n<3이 좋다. 
			System.out.println("Hello Java");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
