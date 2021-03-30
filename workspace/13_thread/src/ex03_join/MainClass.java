package ex03_join;

public class MainClass {

	public static void main(String[] args) {
	
		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();

		calc1.setFrom(1);
		calc1.setTo(500);
		calc2.setFrom(501);
		calc2.setTo(1000);

		calc1.start();
		calc2.start();
		/*
		  System.out.println(calc1.getResult() + calc2.getResult());
		  main이 calc1(thread)과 calc2(thread) 의 작업이 종료될때까지 기다리지 않기 때문에 결과가 나오는 것은 매번 제각각일 것이다. 
		 */

		// thread의 종료를 기다렸다 실행 하는 메소드 : join() 을 사용하여 thread의 종료후 실행이 되도록 한다.
		// join() 호출은 예외처리가 필요하다.
		try {
			calc1.join();
			calc2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(calc1.getResult() + calc2.getResult());
	}

}
