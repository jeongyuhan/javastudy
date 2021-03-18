package ex08_upcasting;

public class MainClass {

	public static void main(String[] args) {
		Tv tv = new Tv(200, "LG-75");
		tv.info(); // Tv클래스의 info()를 호출
		
		Elec elec = tv; // Tv 타입의 객체 tv를 Elec 타입으로 바꾸는 것이 "upcasting" 이다.
						// 서브 -> 슈퍼 타입으로 변경하는 것이 "upcasting"이라고 한다.
						// upcasting은 별도 casting문법이 없다. (그냥 적용된다.)
		elec.info(); // Elec클래스의 info()를 호출
		
		// 메소드의 호출
		// 1. 객체의 타입에 따라 결정된다.
		// 	  호출할 메소드를 결정하는 것을 "바인딩"이라고 표현한다.
		// 2. 자바는 "동적 바인딩" 이다.
		// 	  1) 메소드 호출 시점(실행 전)에는 객체의 타입을 본다. 
		//       Elec elec = tv; 이므로 elec.info()는 Elec의 info()이다.
		//    2) 실제 객체를 확인한다.
		//       Tv tv = new Tv(200, "LG-75"); 이므로 tv 객체가 Tv 타입이라는 것을 확인한다.
		//    3) 실제 객체의 타입으로 바꿔서 호출하고 실행한다.
		//       elec.info() 가 실행될때는 Tv의 info()가 호출된다.
		
		// 결론적으로 호출할때는 Elec의 info()지만 실행할때는 Tv의 info()가 실행된다.
		// elec 객체를 역추적하면 new Tv()가 나오기 때문이다.
		
		// 1)번에 서 끝나는 바인딩을 "정적 바인딩"이라한다.
		// 이 경우 elec의 info()를 불러오게된다.
		
		Elec elec2 = new Tv(300, "Samsung-85");
		// elec2를 만들때 애초에 new Tv()를 사용하면 업캐스팅이된 객체가 생성된다.
		elec2.info();
		// 호출은 Elec의 info()
		// 결과는 Tv의 info()
		
		
		
		
		
		
		
		
		
		
	}

}
