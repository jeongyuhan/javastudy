package ex17_Object.ex02;

public class Dog {

	// field
	private String name;

	// constructor
	public Dog(String name) {
		super(); // Object의 생성자 호출 (생략해도 된다.)
		this.name = name;
	}
	
	// method
	// Object클래스의 toString() 메소드를 사용하지 않기 위해서
	// toString() 메소드를 오버라이드 한다.
	@Override
	public String toString() {
		return "[name : " + name + "]";
	}
		
}
