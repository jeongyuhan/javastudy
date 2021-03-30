package ex01;

/*
	thread(스레드)
	1. 자바의 세부 작업 단위이다.
	2. 생성 방법 (2가지 중 한가지 사용)
		1) Thread 클래스를 상속 받는다. (extends Thread)
		2) Runnable 인터페이스를 구현한다. (implements Runnable)
		*) 1번 방법은 다중 상속을 허용하지 않기 때문에 2번 방법을 대체적으로 사용한다.
	3. 기본 규칙
		1) run() 메소드	  : thread의 작업을 작성하는 메소드이다. 오버라이드하여 사용한다.
		2) start() 메소드 : thread를 실행하는 메소드이다. run() 메소드를 호출하지 않는다.
							start() 메소드를 사용하면 start가 run() 메소드를 호출하는 방식이다.
*/

public class Person extends Thread {

	// field
	private String name;

	// constructor
	public Person(String name) {
		super();
		this.name = name;
	}

	// method
	public void eat() {
		System.out.println(name + "이(가) 먹는 중입니다.");
	}

	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			eat();
		}
	}
	
	
	
	
	
	
	

}
