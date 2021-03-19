package ex13_interface;

// 인터페이스는 본문이 없는 추상메소드만 가지고 있으므로,
// 해당 추상메소드를 반드시 오버라이드 해야 한다.

// 클래스를 상속 받을 때는 extends를 사용하고,
// 인터페이스를 구현할 때는 implements를 사용한다.

// 클래스를 상속받는다. == 인터페이스를 구현한다. 라고 보면 된다.

public class Rectangle implements Shape { // extends => implements
// interface를 구현하는 Rectangle을 implements해주면 Rectangle을 상속받는 Square는 자동으로 문제가 해결된다.
	
	// field
	private int width; // 가로, 너비
	private int height; // 높이
	
	// constructor
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	// method
	@Override
	public double getArea() {
		return width * height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
