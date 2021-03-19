package ex13_interface;

// 인터페이스 (interface)
// 1. 모든 메소드가 추상메소드인 추상클래스이다.
// 2. jdk 1.8 이후에 default 메소드와 static 메소드를 가질 수 있다.
// 3. 모든 field는 final상수를 가진다.(변하지 않는 값을 가진다.)

// interface == abstract class 라고 보면 된다.
public interface Shape {

	// method
	// 모든 도형은 크기가 있다.
	public abstract double getArea(); // interface는 public abstract를 생략해도 자동으로 삽입되서 처리된다.
	
}
