package quiz01;

public class MainClass {

	public static void main(String[] args) {
		
		// 계산기를 만들고, 
		// 4가지 연산을 모두 수행하고,
		// 발생할 수 있는 예외를 예상해서 처리해보자.
		
		Calculator calculator = new Calculator();
		try {
			calculator.addition(10);
			calculator.subtraction(5);
			calculator.multiplication(2);
			calculator.division(0);	 // (10 / 0) : Exception // (10.0 / 0.0) : Infinity
		} catch (ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
		}
		
	}

}
