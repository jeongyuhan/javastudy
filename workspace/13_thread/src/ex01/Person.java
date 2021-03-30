package ex01;

/*
	thread(스레드)
	1. 자바의 세부 작업 단위이다.
	2. 생성 방법 (2가지 중 한가지 사용)
		1) Thread 클래스를 상속 받는다. (extends Thread)
		2) Runnable 인터페이스를 구현한다. (implements Runnable)
	3. 기본 규칙
		1) run() 메소드	  : thread의 작업을 작성하는 메소드이다. 오버라이드하여 사용한다.
		2) start() 메소드 : thread를 실행하는 메소드이다. run() 메소드를 호출하지 않는다.
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
