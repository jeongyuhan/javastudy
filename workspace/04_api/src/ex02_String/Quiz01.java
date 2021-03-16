package ex02_String;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 시간을 입력 받아서 출력하기
		// 시간 >>> 9
		// 분 >>> 5
		// 초 >>> 30
		// 9:05:30 입니다.
		
		
		Scanner sc = new Scanner(System.in);
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		System.out.println("시간 >>>");	 hour = sc.nextInt();
		System.out.println("분 >>>");		 minute = sc.nextInt();
		System.out.println("초 >>>");		 second = sc.nextInt();
		
		String strHour = hour +""; // String.valueOf(hour);
		String strMinute = minute + ""; 
		String strSecond = second + "";
		
		if(strMinute.length() == 1) { // if(minute < 10)
			strMinute = "0" + strMinute;
		}
		if(strSecond.length() == 1) { // if(second < 10)
			strSecond = "0" + strSecond;
		}
		String time = strHour + ":" + strMinute + ":" + strSecond;
		System.out.println(time);

		sc.close();

	
	
	}

}
