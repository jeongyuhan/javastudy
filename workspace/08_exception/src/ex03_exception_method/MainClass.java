package ex03_exception_method;

public class MainClass {

	public static void main(String[] args) {

		try {
			int a = 2 / 0; 
		} catch (ArithmeticException e) {
			// e에는 무엇이 포함되어 있는지 확인해보자.
			System.out.println("예외메시지 : " + e.getMessage());
			// e.getMessage() 에는 예외메시지가 들어있다.(예외가 일어난 이유를 설명해주는 예외메시지)
			e.printStackTrace(); // 예외 문제가 어디서 발생하였는지 Stack의 구조로 저장된 데이터의 위치를 추적해주는 메소드이다.
			// e.getMessage() 는 사용자를 위한 것이고, e.printStackTrace() 는 개발자를 위한 것이다.
		}
		
		
		try {
			Integer.parseInt("1.5");
		} catch (NumberFormatException e) {
			System.out.println("예외메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
	}

}
