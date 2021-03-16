package quiz02;

public class Circle {

	// field 
	private Coord center;
	private double radius;
	private int x;
	private int y;
	
	// constructor
	public Circle(Coord center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(int x, int y, double radius) {
		this.center = new Coord(x, y); // x, y를 받아서 new Coord(x, y) 에 x, y값을 넣어주고 그걸 center에 넣어준다.
		this.radius = radius;
	}



	// method
	
	// info를 만들 때 활용할 getArea()
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
		
	public void info() {
		System.out.print("중심좌표 ");
		center.info(); // [0, 0] 을 보여주는 메소드 호출 / syso 안에서 호출하여 사용하는 것이 아니라 syso를 분리해서 그사이에 필요한 값을 출력해주는 식으로 사용한다.
					   // Coord클래스에서 출력메소드에서 ln을 제거하였기 때문에 출력호출을 해도 줄이 바뀌어 출력되지않는다.
		System.out.println(", 반지름" + radius + ", 넓이" + getArea());		
	}
	
	
}
