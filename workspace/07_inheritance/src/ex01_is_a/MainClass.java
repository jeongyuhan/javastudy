package ex01_is_a;

// Student가 eat()을 사용하고자 한다.

/*
	상속 (inheritance)
	1. 어떤 클래스가 다른 클래스의 기능을 확장(가질 수 있다)하는 것을 의미
	2. 상속이 가능한 대표적인 클래스들의 관계는 is-a 관계이다.
	3. IS-A
	   Person is a Student. 사람은 학생이다.(x)	
	   Student is a Person.	학생은 사람이다.(o) ==> is-a 관계 성립
	4. Student는 Person의 기능(메소드)을(를) 확장할 수 있다.   
*/

/*
	슈퍼클래스와 서브클래스
	1. 슈퍼클래스 : 부모클래스라고도 한다. 메소드를 다른 클래스에게 제공하는 클래스이다.
				Person
	2. 서브클래스 : 자식클래스라고도 한다. 다른 클래스(슈퍼클래스)의 메소드를 제공 받는 클래스이다.
				Student
	3. 형식
	   class 슈퍼클래스명 { }
	   class 서브클래스명 extends 슈퍼클래스명 { }
	   
*/

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.eat();
		
		Student s = new Student();
		s.study();
		s.eat();
		
	}

}
