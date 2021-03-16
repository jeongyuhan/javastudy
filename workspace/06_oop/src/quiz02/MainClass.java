package quiz02;

public class MainClass {

	public static void main(String[] args) {
		
		Coord center = new Coord(0, 0);
		Circle won = new Circle(center, 1.5);
		
		center.info(); // [0, 0]
		System.out.println(); // ln을 제거해주었기 때문에 여기서 줄바꿈을 추가하여 자연스럽게 해준다.
		won.info();	   // 중심좌표 [0, 0], 반지름 1.5, 넓이 x.xxx
		
		Circle won2 = new Circle(1, 1, 1.5);
		won2.info();   // 중심좌표 [1, 1], 반지름 1.5, 넓이 x.xxx
		
	}

}
