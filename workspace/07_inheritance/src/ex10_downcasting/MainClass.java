package ex10_downcasting;
/*
upcasting의 경우 사용할 수 있는 메소드
Person p = new Person(); 
Person p = new Student(); 여기서 호출할 수 있는 메소드 : p.eat(), p.sleep() 두가지이다. p.study() 는 불가능하다.
Person p = new Worker(); 여기서 호출할 수 있는 메소드 : p.eat(), p.sleep() 두가지이다. p.work() 는 불가능하다.
*/
public class MainClass {
	public static void main(String[] args) {

		// 컴파일 	->	 실행
		// 코드점검 ->	 new 처리
		// 위와 같은 순서로 실행되기 때문에 p1.study()같은경우 자바에서는 Person이라고 인식하기 때문에 불가능한 코드이다.
		
		Person p1;
		p1 = new Student();
		p1.eat();
		p1.sleep();
	 // p1.study(); Person p1 만 보고 호출할 메소드를 결정하기 때문에 불가능하다.
		
		// Person타입의 p1을 Student타입으로 변경하면 해결된다.
		// 1. (Student)p1 : p1을 Student로 casting 한다.(downcasting)
		// 2. (Student)p1.study(); : 정상동작하지 않는다. 
		//    연산자 최우선 순위 : 마침표(.)이므로 p1.study()가 먼저 호출되기 때문에
		//	                       괄호를 사용하여 ((Student)p1).study(); 처럼 우선순위를 casting으로 바꿔준다.
		((Student)p1).study();
		
		Person p2;
		p2 = new Worker();
		p2.eat();
		p2.sleep();
		((Worker)p2).work();
		
		Person p3;
		p3 = new Student();
		p3.eat();
		p3.sleep();
		//((Worker)p3).work(); // ClassCastException 발생 (이런식으로 클래스 캐스팅이 불가능 하다고 알려주는 Exception이다.)
							 // 하지만 eclipse에서는 코드에는 문제가 없다고 인식한다. 실행후에 오류를 알려준다.
		
		// 타입을 확인한 뒤 casting 할 수 있다.
		
		// p3가 Student이면 Student로 casting 하고,
		// p3가 Worker이면 Worker로 casting하라.
		// 객체 타입을 비교해주는 연산자 instanceof를 사용한다.
		
		if (p3 instanceof Student) {
			((Student)p3).study();
		} else if (p3 instanceof Worker) {
			((Worker)p3).work();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
