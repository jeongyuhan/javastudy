package ex06_override;

// 에스프레소는 커피이다.

// 서브클래스
public class Espresso extends Coffee {

	// field
	private int water; // 물의 양

	// constructor
	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
		
	// method 
	
	// Espresso 클래스는 이미 Coffee클래스의 메소드를 사용할 수 있다.
	// Espresso 클래스가 Coffee 클래스의 taste() 메소드를 사용하는 것은 적절하지 못하다.
	// Coffee 클래스에서 생성된 taste() 메소드는 bean의 맛을 표현하는 메소드인데 
	// Espresso 클래스에서 사용하면 말이 되지 않는다.
	// 따라서, Espresso 클래스는 자신의 맛을 표현하기 위해서 새롭게 taste() 메소드를 만드는 것이 좋다.
	
	// 메소드 오버라이드 (method override)
	// 슈퍼클래스의 메소드를 사용하지 않기 위해서,
	// 서브클래스가 메소드를 다시 만드는 것을 의미한다.
	
	// 유사단어 : 오버로딩과 오버라이드! 전혀 다르니 주의!
	
	// 오버라이드 주의점
	// 1. 똑같은 형태로 만든다. 똑같지 않으면 오버라이드가 아니다.
	// 2. @Override 애너테이션(annotation)을 작성해준다.
	//	1) 개발자가 자바에게 이 메소드는 오버라이드 하는 것이라고 알린다는 의미이다.
	//	2) 그러면 자바는 오버라이드 규칙을 어겼을 경우 오류를 발생시켜준다.
	
	@Override
	public void taste() {
		System.out.println("에스프레소는 향이 좋지만, 맛은 약간 씁니다.");
	}
	
	
	
	
	
}
