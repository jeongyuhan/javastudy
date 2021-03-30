package ex01;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("자두");
		Person p2 = new Person("스폰지밥");
		Person p3 = new Person("브레드");
	
		/*
		p1.eat();
		p2.eat();
		p3.eat();
		*/
		
		// Person이 thread가 아니면 순차적으로 동작을 하게된다. 
		// p1.eat();이 끝나야 p2.eat();이 실행되고 차례로 실행이 되게 된다.
		
		// thread를 사용하게 되면 동시다발적으로 실행이 되도록 할 수 있다.
	
		// thread는 JVM에 의해서 스케줄링 되기 때문에
		// 코드 작성 순서대로 동작하지 않을 수 있다.
		
		p1.start(); // 자동으로 run() 메소드를 실행한다.
		p2.start();
		p3.start();
		
		System.out.println("모두 식사가 끝났습니다."); // thread 상황에서는 틀린 메세지이다.
		// main이 p1, p2, p3의 실행을 기다렸다 실행되지 않는다. 
		
		
		
	}

}
