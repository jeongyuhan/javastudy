package ex02_loop;

public class Ex04_nested_loop {

	public static void main(String[] args) {
		
		// nested_loop는 반복문안에 반복문을 겹쳐 사용하는 방식을 말한다.
		/*
		for (int out = 1; out <= 10; out++) {
		
			for (int in = 10; in <= 50; in += 10) {
				System.out.println(out + "," + in);
			}
			
		}
		*/
		
		// 1주차 1일차 1교시입니다. 
		// 1주차 1일차 2교시 입니다.
		// ...
		// 총 3주차, 5일, 8교시 입니다.
		
		for (int week = 1; week <= 3; week++) {
			for (int day = 1; day <= 5; day++) {
				for (int cl = 1; cl <= 8; cl++) {
					System.out.println(week + "주차, " + day + "일, " + cl + "교시 " + "입니다." );
				}
			}
		}

		
		
	}

}
