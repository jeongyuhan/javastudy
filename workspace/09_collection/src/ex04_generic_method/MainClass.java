package ex04_generic_method;

public class MainClass {

	public static void main(String[] args) {
		
		Integer[] a = {1, 2, 3};
		Double[] b = {1.5, 2.5, 3.5};
		String[] s = {"hello", "hi", "hahaha"};
		
		Calculator calculator = new Calculator();
		System.out.println(calculator.getTotal1(a));
		System.out.println(calculator.getTotal1(b));
		// System.out.println(calculator.getTotal1(s)); // 메소드 내부에서 s의 타입 String이 Number로 캐스팅하려고 해서 예외가 발생한다. 
		
		System.out.println(calculator.getTotal2(a));
		System.out.println(calculator.getTotal2(b));
		// System.out.println(calculator.getTotal2(s)); // T extends Number 때문에 String은 전달 자체가 안된다. 따라서 getTotal1()와 다르게 예외가 아닌 Error를 발생시켜 실행 자체가 안됨을 알려준다.
		
		// JVM에 따라 구체화가 자동으로 되기 때문에 메소드에서는 구체화를 따로 하지 않는다.
		
		
		
		
	}

}
