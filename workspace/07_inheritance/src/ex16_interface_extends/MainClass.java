package ex16_interface_extends;

public class MainClass {

	public static void main(String[] args) {

		Dog dog = new Dog("댕댕이");
		Snake snake = new Snake("뱜");
		Person person = new Person();
		
		// 1. food주기
		person.feed(dog, "닭고기");
		person.feed(snake, "소고기");
		
		// 2. walking하기
		person.walking(dog);
		// person.walking(snake); // 컴파일 에러를 내고 싶다.
								  // 비어 있는 Walkable 인터페이스를 생성하고,
								  // Dog만 Walkable 인터페이스를 구현하도록 해준 뒤
								  // Person 클래스의 walking()메소드에서 받아오는 매개변수를 Walkable 타입의 pet으로 바꿔주면 
								  // 산책을 할 수 없는 Snake는 Walkable인터페이스를 구현하지 않기 때문에 매개변수로 받아올 수 없게 되고,
								  // 컴파일 에러가 발생하게 된다.
								  // 결론적으로 인터페이스는 구현을 목적이 아닌 타입을 사용하기 위한 목적으로 만들어진 것이다.
		                          // 타입을 구분지어 매개변수로서 차이를 두기 위한 용도
		
		
		
		
	}

}
