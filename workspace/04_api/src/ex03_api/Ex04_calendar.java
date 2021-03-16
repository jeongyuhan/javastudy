package ex03_api;

import java.sql.Date;
import java.util.Calendar;

public class Ex04_calendar {

	public static void main(String[] args) {
		
		// java.util.calrendar
		// 1. 자바에서 날짜와 시간을 처리하는 주요 클래스이다.
		// 2. 미리 정해진 필드를 이용해서 각 단위를 추출할 수 있다.
				
		// 생성 방법
		// 현재 날짜와 시간 생성
		Calendar date = Calendar.getInstance();
		// 연, 월, 일, 요일
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH) + 1; // Calendar.MONTH : 0 ~ 11
		int day = date.get(Calendar.DAY_OF_MONTH); // DAY_OF_MONTH 한달 기준 하루
		int weekNo = date.get(Calendar.DAY_OF_WEEK); // 요일을 번호로 나타낸다. 요일번호 : 일(1), 월(2)......토(7)
		
		String[] weekNames = {"", "일", "월", "화", "수", "목", "금", "토"}; // 요일번호와 인덱스를 맞추기 위해서 인덱스0에 ""비어있는 요소를 넣어준다.
		
		System.out.println(year + "-" + month + "-" + day +" " + weekNames[weekNo] + "요일");
		
		// 오전/오후 , 시, 분, 초, 밀리초 
		int ampm = date.get(Calendar.AM_PM); // 오전 = 0 , 오후 = 1
		int hour = date.get(Calendar.HOUR); // 0 ~ 11
		int hour2 = date.get(Calendar.HOUR_OF_DAY); // 0 ~ 23
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millis = date.get(Calendar.MILLISECOND);
		System.out.println((ampm == 0? "오전" : "오후") + " " + hour + ":" + minute + ":" + second + "." + millis);
		System.out.println((ampm == 0? "오전" : "오후") + " " + hour2 + ":" + minute + ":" + second + "." + millis);
		// AM/PM은 0과1로 나타나기 때문에 삼항연산자를 사용하여 출력하면 "오전"/"오후"로 바꾸기 쉽다.
		
		
		// 날짜 변경하기 (현재 날짜를 만든 다음 가능)
		date.set(1990, 10, 10, 9, 30, 40); // 날짜 : 1990년 11월 10일 9시 30분 40초 / MONTH는 인덱스0부터 시작하기때문에 11월이 된다.
		System.out.println(date);
		
		// Calendar를 이용한 타임스탬프 알아내기
		long timestamp = date.getTimeInMillis();
		System.out.println(timestamp); // 원래는 현재날짜를 알려주나, 위에서 변경을 먼저했기 때문에 변경된 날짜를 기준으로 나오게된다.
		
		// Calendar -> Date(java.sql) 변경해주는 작업
		Date date2 = new Date(timestamp);
		System.out.println(date2);
		
		// Date(java.sql) -> Calendar 변경해주는 작업
		Calendar date3 = Calendar.getInstance();
		date3.setTime(date2);
		System.out.println(date3);
		
		
		
	}

}
