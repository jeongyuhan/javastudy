package ex02_try_catch;

/*
 	-기본적인 try-catch문의 형태
 	
	try {
		코드 작성
		예외발생가능구역
	} catch (예외처리 매개변수) {
		예외처리구역
	}
*/

public class MainClass {

	public static void main(String[] args) {
	
		int a = 0;
		
		try {
			//System.out.println(2 / 0); 	// 예외가 발생하면 try문이 곧바로 종료된다.
			Integer.parseInt("1.5"); 		// 지금 구성한 try-catch문에서는 지금의 Exception을 처리할 수 없다. 
											// catch부분에있는 매개변수의 Exception이 처리할 수 없는 Exception이기 때문이다.
											// 따라서 catch를 추가하여 Exception을 처리해준다.
			a = 10;
		} catch(ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
		} catch(NumberFormatException e) {
			System.out.println("예외가 발생했습니다.2");			
		}
		
		System.out.println(a);
		
		
		
		
		
		try {
			// String name = null;
			// name.equals("james");
			int[] b = new int[3]; 
			b[10] = 10;
		} catch (Exception e) { // Exception은 모든 예외클래스들의 슈퍼클래스이다.
			System.out.println("예외가 발생했습니다.");
		}
		
	
	}

}
