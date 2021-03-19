package ex05_throw;

public class MainClass {

	public static void main(String[] args) {
	/*
		// 예외를 직접 발생시키는 경우 throw를 이용한다.
		try {
			throw new NumberFormatException();
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다. : " + e);
		}
	*/
		
		Calculator calculator = new Calculator();
		
		try {
			calculator.division(0);
		} catch (ArithmeticException e) {
			System.out.println("예외가 발생했습니다. : " + e);
		}
		
		
		
	}

}
