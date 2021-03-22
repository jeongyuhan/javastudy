package ex17_Object.ex04;

public class MainClass {

	public static void main(String[] args) {
	
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.setModel("CA-001");
		p1.setManufacturer("bio");
		p1.setDate("2021-03-01");

		p2.setModel("CA-001");
		p2.setManufacturer("bio");
		p2.setDate("2021-03-05");
		
		// 같은 종류의 제품(model, manufacturer가 모두 같은 경우)
		// 제품은 2개(독립적인 제품)
		
		// Object의 equals() 메소드는 객체의 데이터를 비교하지 않고,
		// 같은 주소에 저장된 객체인지 다른 주소에 저장된 객체인지 비교한다.
		
		if(p1.equals(p2)) {
			System.out.println("같은 종류의 제품입니다.");
		} else
		System.out.println("다른 종류의 제품입니다.");
		// 각각 new로 생성된 서로 다른 객체라고 자바에서는 인식하기 때문에 다르다.(참조값을 비교)

		// Object 클래스의 equals() 와 String 클래스의 equals() 는 다르다.
		// Object 클래스의 equals()는 객체의 주소(참조)값을 비교한다면,
		// String 클래스의 equals()는 문자열을 비교한다.
		// String 클래스의 equals()는 Object 클래스의 equals()를 오버라이드 하여 사용하는 것이라고 보면 된다.
		
		
	}

}
