package ex05_constructor;
/*
	생성자(constructor)
	1. 객체를 생성하는 메소드이다.	값을 받아 전달하는 내용으로만 사용하는 것이다.(초기화만 이뤄지면된다.) 
	2. 특징
		1) 결과타입 : 존재하지 않는다. 아예 작성하질 않는다.
		2) 메소드명 : 클래스명과 같다.
	    3) 매개변수 : 일반 메소드처럼 사용한다. 있으면 선언하고 없으면 안쓴다.
	3. 호출시점
		- 객체를 생성하기 위해서 new를 사용하면 그때 호출된다.
*/
/*
 	<객체가 생성될 때 그에따른 생성자의 모습>
	
	객체 생성							생성자
	Person p = new Person()				Person(){...}
	Person p = new Person("james")		Person(String name){...}
	Person p = new Person("ali", 20)	Person(String name, int age){...}




*/
public class Person {

	// field
	String name;
	int age;
	char gender;
	
	
	// constructor
	Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// constructor overloading
	// 아래 사용된 this()는 생성자를 뜻한다. 	(자주 사용되는 개념은 아니다.)
	Person(String name) {
		this(name, 0, '\0'); // 여기서 사용된 this()는 생성자를 호출한다.
	}						 // 매개변수를 3개 사용했기 때문에 매개변수가 3개 들어있는 생성자를 호출한다.
	
	Person(String name, int age) {
		this(name, age, '\0');
	}
	
	Person() {
		this(null, 0, '\0');
	}
	
	
}
