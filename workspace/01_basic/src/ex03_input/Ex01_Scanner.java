package ex03_input;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		
		// Scanner 클래스
		// 1. 소속된 패키지 : java.util
		// 2. import가 필요하다.
		//    -import가 필요 없는 패키지 : java.lang
		// 3. import를 하는 방법
		//    - 자동완성은 필요한 import를 해준다.
		// 4. 메소드
		//    1) nextInt() : int 입력
	    //    2) nextLong() : long 입력
		//    3) nextDouble() : double 입력
		//    4) next() : String 입력 (공백 없는 String)
		//    5) nextLine() : String 입력 (공백 있는 String)
		//    6) next().charAt() : char 입력
		
		// 입력을 위해서는 "표준 입력 스트림"을 사용한다.
		// 표준 입력 스트림 : System.in
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 이름 입력받기
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine(); // 이름에 공백허용
		
		// 2. 나이 입력받기
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		// 3. 키 입력받기
		System.out.println("키를 입력하세요");
		double height = sc.nextDouble();
		
		// 4. 성별 입력받기
		System.out.println("성별을 입력하세요");
		char gender = sc.next().charAt(0);		
		
		// 5. 입력정보 확인하기
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(gender);
		
		// 6. 사용한 스트림을 반납하는 작업
		sc.close(); // 생략이 가능한 부분이다. 개발자가 닫지않으면 JVM이 스스로 닫는다. (모든 close()가 생략이 가능한 것은 아니다.)
		
		
		
		
		
		
		
		
		
		
 
	}

}
