package ex12_abstract;

// 클래스를 새로 생성할 때 슈퍼클래스를 정해서 만들 수 있다. 

public class Triangle extends Shape {

	// field
	private int width;
	private int height;
	
	// constructor	
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	// method
	@Override
	public double getArea() {
		return width * height * 0.5;
	}

}
