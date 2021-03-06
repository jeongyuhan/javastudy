package ex03_api;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Ex05_SimpleDateFormat {

	public static void main(String[] args) {
		
		/*
			날짜/시간 패턴(pattern)
			1. 년	: yy, yyyy
			2. 월	: M, MM
			3. 일	: d, dd
			4. 요일	: E (일~토)
			5. 오전/오후: a(오전/오후)
			6. 시간
				1) h, hh (0~11) : 12시간 표기법 (오전/오후 표기와 함께 사용)
				2) H, HH (0~23)	: 24시간 표기법
			7. 분	: m, mm
			8. 초	: s, ss 
		*/

		Date date = new Date(System.currentTimeMillis());
		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		System.out.println("non-pattern : " + date);
		System.out.println("pattern : " + sdf.format(date)); // 패턴을 적용해 사용하려면 format() 메소드를 사용해서 출력해줘야 한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
