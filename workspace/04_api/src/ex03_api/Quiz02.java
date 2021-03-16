package ex03_api;

import java.util.Calendar;

public class Quiz02 {

	public static void main(String[] args) {
		
		// Calendar를 활용해서 기념일 계산하기
		// 1) 두 개의 날짜를 만들고, 그 중 하나는 기념일로 수정
		// 2) 날짜의 차이를 구하고, 그 결과를 일 수로 출력하기
		
		
		/*
		Calendar start = Calendar.getInstance();
		
		int year = start.get(Calendar.YEAR);
		int month = start.get(Calendar.MONTH) + 1;
		int day = start.get(Calendar.DAY_OF_MONTH); 
		int weekNo = start.get(Calendar.DAY_OF_WEEK);
		
		start.set(2021, 2, 3);
		
		Calendar now = Calendar.getInstance();
		
		calendar event = new 
		*/
		
			
		// 선생님이 푼 해답)
		Calendar anniversary = Calendar.getInstance();		
		anniversary.set(2000, 0, 1);
		
		Calendar today = Calendar.getInstance();

		// 타임스태프의 차이를 구한다.
		long elapseTime = today.getTimeInMillis() - anniversary.getTimeInMillis();
		
		// 밀리초 -> 일(1000밀리초 * 60 * 60 * 24  == 1일
		long elapseDay = elapseTime / (1000 * 60 * 60 * 24);
		
		System.out.println("경과한 일수는" + elapseDay + "일입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
