package ex04_this;
/*
	this
	1. this는 객체 자신을 의미한다.
	2. 어떤 클래스 내부에서만 사용한다.
	3. 활용
		1) this.필드	(가장 주된 활용법) 필드임을 나타낼 때 사용한다.
		2) this() 		(다른 생성자를 호출하는 것을 의미한다.)


*/
public class Car {

	// field
	String model;
	String manufacturer;
	int price;
	
	// method
	void set(String model, String manufacturer, int price) { // 매개변수의 이름을 필드와 동일하게 사용하면 this.를 사용하여 필드명과 매개변수를 구분해준다.
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	// void info()에는 충돌하는 같은 이름의 매개변수가 없기 때문에 this를 사용하지 않아도 info() 메소드에 사용된 것이 field임을 알 수 있다.
	void info() {
		System.out.println("모델명: " + model);
		System.out.println("제조사: " + manufacturer);
		System.out.println("가격: " + price);
	}
	
	
}
