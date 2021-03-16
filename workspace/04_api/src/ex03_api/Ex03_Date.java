package ex03_api;

import java.sql.Date;

public class Ex03_Date {

	public static void main(String[] args) {
		
		// java.sql.Date
		// DB의 Date타입에 맞게끔 wrapping 처리한 클래스이다.
		
		// 선언 방법
		long date = System.currentTimeMillis();
		Date today = new Date(date);
		
		System.out.println(today);
		
		// 가입일 등 현재날짜를 만드는 작업은 DB에서 이뤄지기 때문에 가볍게 여겨도 되는 클래스이다.
		// DB와의 호환을 위해서 java.util.Date 가 아닌 java.sql.Date를 사용한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
